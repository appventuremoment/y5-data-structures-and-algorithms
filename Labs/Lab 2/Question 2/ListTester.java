public class ListTester {
    public static void main(String[] args) {
        HeadLinkedList list = new HeadLinkedList();
        list.addToRear('a');
        list.addToRear('b');
        list.addToRear('c');
        list.addToRear('d');
        list.addToRear('e');
        list.reverse();
        System.out.println(list);
        list.reverse();
        System.out.println(list.frontBackSplit());
        System.out.println(list);
    }
}
