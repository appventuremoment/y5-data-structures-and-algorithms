## Reverse & Split

Add in relevant code in HeadLinkedList.java to implement the following methods:

a)  reverse()
Complete the code required to reverse a singly linked list ITERATIVELY.

b) frontBackSplit()
Calling this method will split the list into two sublists — one for the front half, and one for the back half. If the number of elements is odd, the extra element should go in the front list.
So frontBackSplit() on the list A = {2, 3, 5, 7, 11} should yield the two lists  B = {2, 3, 5} and  A = {7, 11}, where the original list now contains nodes from the back of the list. The method should return list B (i.e. the front of the list).
You must implement FrontBackSplit() with the following restrictions:

- Your algorithm should not count the nodes and do not use the size or length method of any data structure.
- You are not allowed to create any new node (or duplicate new list) or use any other data structure to store the values (i.e. you should split by editing pointers of the existing list).
- You are not allowed to use the tail pointer (you may only use the head pointer).

Finally, create a file called TestLinkedList.java to test the methods you have coded. In the tester class, you should then use the iterator to traverse your list.