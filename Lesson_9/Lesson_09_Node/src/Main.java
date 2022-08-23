public class Main {
    static Node head;
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        head = n1;
        n1.next = n2;
        n2.next = n3;

        print();

        addAtHead(0);
        print();

        addAtTail(4);
        print();

        addAtIndex(3,5);
        print();

        deleteAtIndex(0);
        print();
    }

    public static void print() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);       // in ra giá trị hiện tại
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static void print(Node headNode) {
        if (headNode == null) {
            System.out.println("List is empty");
        } else {
            Node temp = headNode;
            while (temp != null) {
                System.out.print(temp.val);       // in ra giá trị hiện tại
                temp = temp.next;
                if (temp != null) {
                    System.out.println(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static int get(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static void addAtHead(int val) {
        //Bước 1: Tạo Node mới
        Node newNode = new Node(val);

        //Bước 2: Trỏ Node mới vào head
        newNode.next = head;
        head = newNode;
    }

    public static void addAtTail(int val) {
        Node newNode = new Node(val);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;       // tìm địa chỉ node cuối
        }
        temp.next = newNode;
    }

    public static void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            Node newNode = new Node(val);

            Node temp = head;
            int count = 0;
            while (temp.next != null) {
                count++;

                if (count == index) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public static void deleteAtIndex(int index) {
        if (index == 0){
            head = head.next;
        }
        int count = 0;
        if (head != null) {
            Node currentNode = head;
            Node prevNode = null;
            while (currentNode != null) {
                if (count == index) {
                    prevNode.next = currentNode.next;
                    break;
                }
                count++;
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    //141,206
}
