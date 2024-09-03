The current toString() method in LinkedBinaryTree.java does not allow for a very useful print in helping us visualize how the tree looks like.
Modify the toString() method in LinkedBinaryTree.java which will print the structure of the tree.

For example, given the BST in Q1, System.out.println(BST) will print the following:
```
11 
6  19 
4  8  17 43 
   5     10       31 49
```

Explanation of above:

- Use String.format("%-2d", element) + " " to print the element if there exists a node at the respective part of the tree
- Print 3 whitespaces if there is no node at the respective part of the tree
- At the end of each level (including the last), have a "\n" to include a next line.