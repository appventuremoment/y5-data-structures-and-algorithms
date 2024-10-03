import java.util.*;

class ArrayStack <E> implements StackADT <E> {
	private E[] arr;
	private int top;
	private int maxSize;
	private final int INITSIZE = 1000;

	public ArrayStack() {
		arr = (E[]) new Object[INITSIZE]; // creating array of type E
		top = -1;  // empty stack - thus, top is not on an valid array element
		maxSize = INITSIZE;
	}

	public boolean isEmpty() { 
		return (top < 0); 
	}

    public int size(){
  		return top + 1;
    }
	public E peek() throws EmptyCollectionException {
		if (!isEmpty()) return arr[top];
		else throw new EmptyCollectionException("Empty stack");
	}

	public E pop() throws EmptyCollectionException {
		E obj = peek();
		arr[top] = null;
		top--;
		return obj;
	}

	public void push(E obj) {
		if (top >= maxSize - 1) enlargeArr();
		top++;
		arr[top] = obj;
	}

	private void enlargeArr() {
		// When there is not enough space in the array
		// we use the following method to double the number 
		// of entries in the array to accommodate new entry
		int newSize = 2*maxSize;
		E[] x = (E[]) new Object[newSize];

		for (int j=0; j < maxSize; j++) {
			x[j] = arr[j];
		}
		maxSize = newSize;
		arr = x;
	}
}