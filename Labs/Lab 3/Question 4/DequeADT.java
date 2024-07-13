

public interface DequeADT<T>
{

   public int size();
   public boolean isEmpty();
   public T getFirst();
   public T getLast();
   public void addFirst(T element);
   public void addLast(T element);
   public T removeFirst();
   public T removeLast();
}

