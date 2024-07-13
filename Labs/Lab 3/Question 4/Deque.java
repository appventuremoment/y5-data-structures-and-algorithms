import java.util.Arrays;

public class Deque<T> implements DequeADT<T> {
	private static final int DEFAULT_SIZE = 10;
	T[] array;
	private int count = 0;
	private int first = DEFAULT_SIZE / 2 - 1;
	private int last = DEFAULT_SIZE / 2;

	Deque() {array = (T[]) new Object[DEFAULT_SIZE];}

	@Override
	public int size() {return count;}
	@Override
	public boolean isEmpty() {return count < 1;}
	@Override
	public T getFirst() {return array[first + 1];}
	@Override
	public T getLast() {return array[last - 1];}

	@Override
	public void addFirst(T element) {
		if (first < 0) {erectArray();}
		array[first--] = element;
		count++;
	}

	@Override
	public void addLast(T element) {
		if (last >= array.length) {erectArray();}
		array[last++] = element;
		count++;
	}

	@Override
	public T removeFirst() {
		if(getFirst() == null){throw new EmptyCollectionException("Deque");}
		else{
			count--;
			return array[++first];
		}
	}

	@Override
	public T removeLast() {
		if(getLast() == null){throw new EmptyCollectionException("Deque");}
		else{
			count--;
			return array[--last];
		}
	}
	private void erectArray(){
		T[] newArr = (T[]) new Object[2 * array.length];
		System.arraycopy(array, 0, newArr, array.length / 2, array.length);
		first = array.length / 2 + first;
		last = array.length / 2 + last;
		array = newArr;
	}

	public String toString() {
		return Arrays.toString(array);
	}
}
