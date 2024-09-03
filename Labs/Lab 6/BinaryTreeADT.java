import java.util.Iterator;

public interface BinaryTreeADT<T> {
   /** 
    * Returns a reference to the root element 
    *
    * @return               a reference to the root
    */
   public T getRoot ();

   /** 
    * Returns true if this binary tree is empty and false otherwise.
    *
    * @return  true if this binary tree is empty
    */
   public boolean isEmpty();

   /** 
    * Returns the number of elements in this binary tree.
    *
    * @return  the integer number of elements in this tree
   */
   public int size();

   /** 
    * Returns true if the binary tree contains an element that matches
    * the specified element and false otherwise. 
   *
    * @param targetElement  the element being sought in the tree
    * @return               true if the tree contains the target element
    */
   public boolean contains (T targetElement);

   /** 
    * Returns a reference to the specified element if it is found in 
    * this binary tree.  Throws an exception if the specified element
    * is not found.
    *
    * @param targetElement  the element being sought in the tree
    * @return               a reference to the specified element
    */
   public T find (T targetElement);

   /**  
    * Returns the string representation of the binary tree.
    *
    * @return  a string representation of the binary tree
    */
   public String toString();

   /**  
    * Performs an inorder traversal on this binary tree by calling an 
    * overloaded, recursive inorder method that starts with the root. 
    *
    * @return  an iterator over the elements of this binary tree
    */
}