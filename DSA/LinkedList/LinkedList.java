public class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            } n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0) {
            insertAtStart(data);
            return;
        }
        Node n = head;

        for(int i = 0; i < index - 1; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
            return;
        }

        Node node = head;
        Node node1 = null;
        for (int i = 0; i < index -1; i++){
            node = node.next;
        }
        node1 = node.next;
        node.next = node1.next;
        node1 = null;
    }

    public void show() {
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
