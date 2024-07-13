public class MinStackTester {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-4);
        minStack.push(5);
        System.out.println(minStack.min());
    }
}
