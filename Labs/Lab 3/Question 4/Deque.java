import java.util.Arrays;

public class Deque<T> implements DequeADT<T> {
	private static final int DEFAULT_SIZE = 10;
	T[] array;
	private int count = 0;
	private int first = 0;
	private int last = DEFAULT_SIZE - 1;

	Deque() {
		array = (T[]) new Object[DEFAULT_SIZE];
		last = array.length / 2;
		first = last - 1;
	}
}
