public class DequeTester {
    public static void main(String[] args) {
        Deque<String> deque = new Deque<>();
        deque.addFirst("a");
        deque.removeLast();
        deque.removeLast();
        System.out.println(deque.isEmpty());
    }
}
