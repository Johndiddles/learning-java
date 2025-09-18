

public class Runner {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(20);
        list.insert(22);
        list.insert(54);

        list.insertAt(2, 93);

        list.deleteAt(1);
        
        list.show();
    }
}
