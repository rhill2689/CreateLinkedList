

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertInOrder(0);
        linkedList.insertInOrder(2);
        linkedList.insertInOrder(1);
        linkedList.print();

        boolean exists = linkedList.contains(2);
        System.out.println("contains: " + exists);

        System.out.println("Size: " + linkedList.size());

    }
}
