public class Q5 {
    public static <T> void insertRear(LinearNode<T> l, T val){
        if (l.getNext() == null) l.setNext(new LinearNode<>(val, null));
        else insertRear(l.getNext(), val);
    }

    public static void main(String[] args){
        LinearNode<String> start = new LinearNode<>("a", new LinearNode<>("b", new LinearNode<>("c", new LinearNode<>("d", null))));
        insertRear(start, "e");
        LinearNode<String> current = start;
        while(current!=null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}