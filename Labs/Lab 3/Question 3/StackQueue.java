public class StackQueue<T> implements QueueADT<T>{
    private LinkedStack<T> stack, revstack;

    public StackQueue() {
        stack = new LinkedStack<>();
        revstack = new LinkedStack<>();
    }

    public void enqueue(T element) {stack.push(element);}
    public T dequeue() {
        reverse();
        return revstack.pop();
    }
    public T first() {
        reverse();
        return revstack.peek();
    }
    public boolean isEmpty() {return stack.isEmpty();}
    public int size() {return stack.size();}

    private void reverse(){while(!stack.isEmpty()) revstack.push(stack.pop());}
}