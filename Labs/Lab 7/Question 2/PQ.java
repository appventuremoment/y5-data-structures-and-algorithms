import java.util.ArrayList;

public class PQ <K,V extends Comparable<V>> {
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    ArrayList<Node> PQueue;
    public PQ() {
        this.PQueue = new ArrayList<>();
    }

    public void enqueue(K key, V value) {
        // Add a new item to the priority queue: Write your code here
        this.PQueue.add(new Node(key, value));
        shiftUp();
    }

    public V dequeue() {
        // Remove the highest priority item: Write your code here
        if (this.PQueue.isEmpty()) {return null;}
        else{
            Node removed = this.PQueue.remove(0);
            if (!this.PQueue.isEmpty()) {
                this.PQueue.add(0, PQueue.remove(PQueue.size() - 1));
                shiftDown();
            }
            return removed.value;
        }
    }

    public V peek() {
        // Check, but do not remove, the highest priority item: Write your code here
        if (!this.PQueue.isEmpty()) {return PQueue.get(0).value;}
        else {return null;}
    }

    public void shiftUp(){
        int next = PQueue.size() - 1;
        Node temp = PQueue.get(next);

        while ((next > 0) && (temp.value.compareTo(PQueue.get((next - 1) / 2).value) > 0)){
            PQueue.set(next, PQueue.get((next - 1)/ 2));
            next = (next - 1) / 2;
        }
        PQueue.set(next, temp);
    }

    public void shiftDown(){
        Node temp;
        int next;
        int curr = 0, left = 1, right = 2;

        if (left >= this.PQueue.size() && right >= this.PQueue.size()){
            next = this.PQueue.size();
        } else if (right >= this.PQueue.size() || this.PQueue.get(left).value.compareTo(this.PQueue.get(right).value) > 0) {
            next = left;
        }
        else{
            next = right;
        }

        temp = PQueue.get(curr);

        while ((next < PQueue.size()) && (this.PQueue.get(next).value.compareTo(temp.value) > 0)){
            this.PQueue.set(curr, this.PQueue.get(next));
            curr = next;
            left = 2 * curr + 1;
            right = 2 * curr + 2;
            if (left >= this.PQueue.size() && right >= this.PQueue.size()){
                next = this.PQueue.size();
            } else if (right >= this.PQueue.size() || this.PQueue.get(left).value.compareTo(this.PQueue.get(right).value) > 0) {
                next = left;
            }
            else{
                next = right;
            }
        }
        this.PQueue.set(curr, temp);
    }

    @Override
    public String toString() {return PQueue.toString();}

    public static void main(String[] args) {
        PQ<String,String> pq = new PQ<>();
        pq.enqueue("1", "1");
        pq.enqueue("2", "4");
        pq.enqueue("3", "3");
        pq.enqueue("4", "2");
        System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println(pq.dequeue());
        System.out.println(pq);
    }
}