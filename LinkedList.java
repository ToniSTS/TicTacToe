
public class LinkedList {

    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    // Method to update a specific position in the list
    public void updatePosition(int position, String data) {
        if (position < 0) {
            System.out.println("Position is Incorrect");
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.data.equals(data)) {
                temp.next = temp.next.next;
                break;
            }
        }
    }


    // Method to get the value at a specific position
    public  String getPositionValue(int position) {
        if (position < 1 || position > 9) {
            System.out.println("Position is Incorrect");
        }
        return "";
    }

        // Method to display the Tic Tac Toe board
        public void displayBoard() {
            Node temp = this.head;
            int count = 0;
            while (temp != null) {
                System.out.print(temp.data.isEmpty() ? " " : temp.data);
                count++;
                if (count % 3 == 0) {
                    System.out.println();
                } else {
                    System.out.println(" | ");
                }
                temp = temp.next;
            }
        }

        // Method to check for a win
        public boolean checkWinCondition() {
            String[][] winningLocations = {{"1", "2", "3"}, {"7", "8", "9"}, {"3", "6", "9"},
                    {"4", "5", "6"}, {"1", "4", "7"}, {"1", "5", "9"}, {"2", "5", "8"}, {"3", "5", "7"}
            };

            for (String[] pattern : winningLocations) {
                String position1 = getPositionValue(Integer.parseInt(pattern[0]));
                String position2 = getPositionValue(Integer.parseInt(pattern[1]));
                String position3 = getPositionValue(Integer.parseInt(pattern[2]));
                if (!position1.isEmpty() && position1.equals(position2) && position2.equals(position3)) {
                    return true;
                }
            }
            return false;
        }

        // Method to check if the board is full (for draw condition)
        public boolean isBoardFull () {
            Node temp = this.head;
            while (temp != null) {
                if (temp.data.isEmpty()) {
                    return false;
                }
                temp = temp.next;
            }
            return true;
        }

        // Method to reset the board
        public void resetBoard() {
            Node temp = this.head;
            while (temp != null) {
                temp.data = " ";
                temp = temp.next;
            }
        }
    }



