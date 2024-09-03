We have discussed in lesson how to construct a binary tree based on the in-order and post-order traversal given.

In this question, you are required to construct a binary tree given its in-order and pre-order traversal.
Complete the method called constructTree() in BSTTester.java. Test that your tree is constructed correctly by printing the tree with the modified toString() you have completed in Q2.
(You have to copy paste your solution from Q2 into LinkedBinaryTree.java for this question)

Note that you are to use recursion to build the tree.
Sample Input: 

Pre-order: 11  6  4  5  8  10  19  17  43  31  49
In-order: 4  5  6  8  10  11  17  19  31  43  49


Expected Output:
```
11 
6  19 
4  8  17 43
   5     10       31 49
```