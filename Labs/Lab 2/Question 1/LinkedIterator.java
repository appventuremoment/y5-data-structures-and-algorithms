import java.util.*;

public class LinkedIterator<T> implements Iterator<T> {
    private LinearNode<T> current;

    public LinkedIterator(LinearNode<T> head, int count) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current.getNext() != null;
    }

    @Override
    public T next() {
        if (hasNext()) {
            current = current.getNext();
            return current.getElement();
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
