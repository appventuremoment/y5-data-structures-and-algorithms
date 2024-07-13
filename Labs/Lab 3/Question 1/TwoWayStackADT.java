
public interface TwoWayStackADT<E> {
	
	//Checks that the top stack is empty
	public boolean topEmpty();
	
	//Checks that the bottom stack is empty
	public boolean bottomEmpty();
	
	//Returns first element in top stack, but does not pop it
	public E peekTop() ;
	
	//Returns first element in bottom stack, but does not pop it
	public E peekBottom();
	
	//Pushes an item into the top stack
	public void pushTop(E item);
	
	//Pushes an item into the bottom stack
	public void pushBottom(E item);
	
	//Returns the item popped from the top stack
	public E popTop();
	
	//Returns the item popped from the bottom stack
	public E popBottom();
	
	//Returns a string representation of this two way stack. 
    public String toString();
}
