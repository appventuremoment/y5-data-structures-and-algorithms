import java.util.Iterator;

public class HeadLinkedList<T> implements ListADT<T>
{
    private int count;
    private LinearNode<T> head;

    /**
     * Creates an empty list.
     */
    public HeadLinkedList()
    {
        count = 0;
        head = null;
    }

    /**
     * Removes the first element in this list and returns a reference
     * to it.  Throws an EmptyListException if the list is empty.
     *
     * @return                           a reference to the first element of
     *                                   this list
     * @throws EmptyCollectionException  if an empty collection exception occurs
     */
    public T removeFirst() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException ("List");

        LinearNode<T> result = head;
        head = head.getNext();
        count--;

        return result.getElement();
    }

    /**
     * Removes the last element in this list and returns a reference
     * to it.  Throws an EmptyListException if the list is empty.
     *
     * @return                           the last element in this list
     * @throws EmptyCollectionException  if an empty collection exception occurs
     */
    public T removeLast() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException ("List");

        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current.getNext() != null)
        {
            previous = current;
            current = current.getNext();
        }

        previous.setNext(null);
        LinearNode<T> result = current;
        count--;

        return result.getElement();
    }

    /**
     * Removes the first instance of the specified element from this
     * list and returns a reference to it.  Throws an EmptyListException
     * if the list is empty.  Throws a NoSuchElementException if the
     * specified element is not found in the list.
     *
     * @param targetElement              the element to be removed from the list
     * @return                           a reference to the removed element
     * @throws EmptyCollectionException  if an empty collection exception occurs
     */
    public T remove (T targetElement) throws EmptyCollectionException, ElementNotFoundException
    {
        if (isEmpty())
            throw new EmptyCollectionException ("List");

        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current != null && !found)
            if (targetElement.equals (current.getElement()))
                found = true;
            else
            {
                previous = current;
                current = current.getNext();
            }

        if (!found)
            throw new ElementNotFoundException ("List");

        if (size() == 1)							//list has only 1 element
            head = null;
        else if (current.equals (head))			//delete first node (head)
            head = current.getNext();
        else if (current.getNext()==null)			//delete last node (tail)
        {
            previous.setNext(null);
        }
        else										//delete middle node
            previous.setNext(current.getNext());

        count--;

        return current.getElement();
    }

    /**
     * Returns true if the specified element is found in this list and
     * false otherwise.  Throws an EmptyListException if the specified
     * element is not found in the list.
     *
     * @param targetElement              the element that is sought in the list
     * @return                           true if the element is found in
     *                                   this list
     * @throws EmptyCollectionException  if an empty collection exception occurs
     */
    public boolean contains (T targetElement) throws
            EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException ("List");

        boolean found = false;
        Object result;

        LinearNode<T> current = head;

        while (current != null && !found)
            if (targetElement.equals (current.getElement()))
                found = true;
            else
                current = current.getNext();

        return found;
    }

    /**
     * Returns true if this list is empty and false otherwise.
     *
     * @return  true if this list is empty
     */
    public boolean isEmpty()
    {
        return (count == 0);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return  the integer representation of the number of elements in this list
     */
    public int size()
    {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<>(head, count);
    }


    public LinearNode<T> getHead() {
        return head;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return  a string representation of this list
     */
    public String toString()
    {
        LinearNode<T> current = head;
        String result = "";

        while (current != null)
        {
            result = result + (current.getElement()).toString(); //+ "\n";
            current = current.getNext();
        }

        return result;
    }

    /**
     * Returns the first element in this list.
     *
     * @return  the first element in this list
     */
    public T first()
    {
        return head.getElement();
    }

    /**
     * Returns the last element in this list.
     *
     * @return  the last element in this list
     */
    public T last()
    {
        LinearNode<T> current = head;
        while (current.getNext() != null){
            current=current.getNext();
        }
        return current.getElement();
    }

    /**
     * Adds element after target element.
     */
    public void addAfter (T element, T targetElement){
		//add your code from Q1
        if (isEmpty()) {
            throw new EmptyCollectionException ("List");
        }
        else if (!contains(targetElement)){
            throw new ElementNotFoundException ("List");
        }
        LinearNode<T> current = head;

        while (current != null) {
            if (current.getElement().equals(targetElement)) {
                break;
            } else {
                current = current.getNext();
            }
        }
        LinearNode<T> newNode = new LinearNode<>(element);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        count++;
    }

    /**
     * Adds element to the end of the linked list.
     */
    public void addToRear (T element){
		//add your code from Q1
        LinearNode<T> newNode = new LinearNode<>(element);
        if (isEmpty()){
            head = newNode;
        }
        else {
            LinearNode<T> current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        count++;
    }


    public void addToFront (T element){
        head = new LinearNode <T> (element, head);
        count++;
    }

    public void reverse(){
        LinearNode<T> current = head;
        LinearNode<T> previous = null;
        while (current != null) {
            LinearNode<T> next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }

//    Return front half, make back half be the list
    public HeadLinkedList<T> frontBackSplit(){
        LinearNode<T> iterateby1 = head;
        LinearNode<T> iterateby2 = head;
        while(iterateby2!=null){
            iterateby1 = iterateby1.getNext();
            iterateby2 = iterateby2.getNext();
            if (iterateby2 == null) {
                break;
            }
            else {
                iterateby2 = iterateby2.getNext();
            }
        }
        assert iterateby1 != null;
        LinearNode<T> endofreturn = iterateby1;
        iterateby1 = head;
        HeadLinkedList<T> result = new HeadLinkedList<>();
        while(iterateby1!=endofreturn){
            result.addToRear(iterateby1.getElement());
            iterateby1 = iterateby1.getNext();
        }
        head = endofreturn;
        return result;
    }
}