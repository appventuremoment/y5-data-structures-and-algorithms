public class MinStack<E extends Comparable<E>>{
	private ArrayStack<E> arr;
	private ArrayStack<E> minhistory;

	public MinStack(){
		arr = new ArrayStack<>();
		minhistory = new ArrayStack<>();
	}

	public void push(E element){
		if (arr.isEmpty()){
			arr.push(element);
			minhistory.push(element);
		}
		else {
			arr.push(element);
			if(minhistory.peek().compareTo(element) < 0){
				minhistory.push(minhistory.peek());
			}
			else{
				minhistory.push(element);
			}
		}
	}
	public E pop(){
		minhistory.pop();
		return arr.pop();
	}

	public E min(){
		return minhistory.peek();
	}
	public E peek(){
		return arr.peek();
	}
	public boolean isEmpty(){return arr.isEmpty();}
	public int size(){return arr.size();}
}

