class DoublyLL {
    Node head, tail;

    class Node {   //doubly linklist
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        System.out.println("Forward!");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        System.out.println("Backward!");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;

        }
        head = head.next;
        head.prev = null;

    }

    public void deleteLast() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;

        }
        tail = tail.prev;
        tail.next = null;

    }
}
class DoublyList{
    public static void main(String[] args) {
        System.out.println("Doubly linklist!");
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.addFirst(10);
        doublyLL.addFirst(20);
        doublyLL.addFirst(30);
        doublyLL.addFirst(40);
        doublyLL.addFirst(50);
        doublyLL.printForward();
        System.out.println();
        System.out.println("Printed after addLAST");
        doublyLL.addLast(60);
        doublyLL.printForward();

        doublyLL.deleteFirst();
        doublyLL.deleteLast();
        System.out.println();
        System.out.println("printed after removing first and last");
        doublyLL.printForward();


    }
}


//class DoublyLL{
//    Node head,tail;
//
//    class Node {   //doubly linklist
//        int data;
//        Node next;
//        Node prev;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//    public void addFirst(int data){
//        Node newNode = new Node(data);
//        if (head == null){
//            head = tail = newNode;
//            return;
//        }
//        newNode.next = head;
//        head.prev = newNode;
//        head = newNode;
//    }
//    public void printForward(){
//        System.out.println("Forward!");
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public void printBackward(){
//        System.out.println("Backward!");
//        Node temp = tail;
//        while (temp != null){
//            System.out.print(temp.data + " <- ");
//            temp = temp.prev;
//        }
//        System.out.println("null");
//    }
//
//}
//class DoublyLinkList{
//    public static void main(String[] args) {
//        System.out.println("Doubly linklist!");
//        DoublyLL doublyLL = new DoublyLL();
//        doublyLL.addFirst(10);
//        doublyLL.addFirst(20);
//        doublyLL.addFirst(30);
//        doublyLL.addFirst(40);
//        doublyLL.addFirst(50);
//
//        doublyLL.printForward();
//        doublyLL.printBackward();
//
//
//    }
//}