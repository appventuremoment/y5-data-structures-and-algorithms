public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        list.addToRear(21);
        System.out.println(list);
        list.addAfter(51, 2);
        list.addToRear(22);
        System.out.println(list);
    }
}
