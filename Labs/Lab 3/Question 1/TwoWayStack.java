import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoWayStack<E> implements TwoWayStackADT<E> {
    private E[] arr;
    private final int INITSIZE = 10;
    private int maxSize;
    private int count;
    private int top;
    private int bottom;

    public TwoWayStack() {
        arr = (E[]) new Object[INITSIZE];
        count = 0;
        maxSize = INITSIZE;
        top = -1;
        bottom = maxSize;
    }

    public int size() {
        return count;
    }

    @Override
    public boolean topEmpty() {
        return top < 0;
    }

    @Override
    public boolean bottomEmpty() {
        return bottom >= maxSize;
    }

    @Override
    public E peekTop() {
        if (topEmpty()) {
            throw new EmptyStackException();
        }
        else return arr[top];
    }

    @Override
    public E peekBottom() {
        if (bottomEmpty()) {
            throw new EmptyStackException();
        }
        else return arr[bottom];
    }

    @Override
    public void pushTop(E item) {
        if (size() >= maxSize) erectArray();
        top++;
        arr[top] = item;
        count++;
    }

    @Override
    public void pushBottom(E item) {
        if (size() >= maxSize) erectArray();
        bottom--;
        arr[bottom] = item;
        count++;
    }

    @Override
    public E popTop() {
        if (topEmpty()) {
            throw new EmptyStackException();
        }
        else {
            E ret = peekTop();
            arr[top] = null;
            top--;
            count--;
            return ret;
        }
    }

    @Override
    public E popBottom() {
        if (bottomEmpty()) {
            throw new EmptyStackException();
        }
        else {
            E ret = peekBottom();
            arr[bottom] = null;
            bottom++;
            count--;
            return ret;
        }
    }

    private void erectArray(){
        E[] firsthalf = Arrays.copyOfRange(arr, 0, top + 1);
        E[] secondhalf = Arrays.copyOfRange(arr, bottom, maxSize);
        maxSize *= 2;
        E[] newArr = (E[]) new Object[maxSize];
        System.arraycopy(firsthalf, 0, newArr, 0, top + 1);
        System.arraycopy(secondhalf, 0, newArr, maxSize - (maxSize / 2 - bottom), maxSize / 2 - bottom);
        bottom = maxSize - (maxSize / 2 - bottom);
        arr = newArr;
    }
}