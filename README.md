# Data Structures and Algorithms - Course Work

This repository contains **Java implementations** of various **data structures** and **algorithms**, demonstrating core concepts of **Object-Oriented Programming (OOP)**, recursion, and algorithmic problem-solving.

## 📂 Repository Contents & Implementation Details

This project is a collection of commonly used **data structures** and **algorithms** implemented in **Java**.  
It includes **Stacks, Queues, Linked Lists, Recursion-based algorithms, Searching, Sorting, and Binary Search Trees (BSTs)**.  

The purpose is to **practice and demonstrate understanding** of fundamental programming concepts in Java while providing reusable code examples.

### 1. Searching Algorithms
I have implemented both iterative and recursive searching techniques:
* **Linear Search:** Implemented recursively in `Searching_Recursion.java` and iteratively in `SearchingIterative.java`.
* **Binary Search:** Implemented for sorted arrays using both recursion and iteration.
* **Time Complexity:** - Linear Search: $O(n)$
  - Binary Search: $O(\log n)$



### 2. Sorting Algorithms (`Sorting_Quick_Merge.java`)
Efficient sorting methods using the Divide and Conquer approach:
* **Merge Sort:** Recursively divides the array into halves, sorts them, and conquers by merging.
* **Quick Sort:** Partitions the array based on a pivot element.
* **Time Complexity:** $O(n \log n)$ average for both.

### 3. Linked Lists (`DoublyLinklist.java`)
* **Doubly Linked List:** A linear data structure where each node contains data and pointers to both the `next` and `previous` nodes.
* **Operations:** Includes methods for `addFirst`, `addLast`, `deleteFirst`, `deleteLast`, and both forward and backward traversal.



### 4. Stacks & Queues
* **Queue (`Queue_Array_Linklist.java`):** An array-based implementation of a Queue (FIFO). It includes utility functions to find the `maximum` element and the `sum` of all elements.
* **Stack (`Stack_LinkList.java`):** Implementation of a Stack (LIFO) using both `ArrayList` and custom `Node` structures.

### 5. Binary Search Trees (BST)
Implementation of non-linear hierarchical data structures:
* **Files:** `BinarySearch_Trees.java` and `BinarySearchTree_Recursive.java`.
* **Operations:** Supports `Insert`, `Search`, `Delete`, and `Height` calculation.
* **Traversals:** Inorder, Preorder, and Postorder.



---

## 📊 Performance Summary

| Algorithm / Data Structure | Time Complexity (Average) | Space Complexity |
| :--- | :--- | :--- |
| **Quick Sort** | $O(n \log n)$ | $O(\log n)$ |
| **Merge Sort** | $O(n \log n)$ | $O(n)$ |
| **Binary Search** | $O(\log n)$ | $O(1)$ |
| **BST Search** | $O(\log n)$ | $O(h)$ |
| **Linked List Access** | $O(n)$ | $O(1)$ |

---

## 🚀 How to Run the Code
1. Open the project in any **Java IDE** (IntelliJ IDEA, Eclipse, or NetBeans).
2. Choose the module/class you want to run (e.g., `Stack_LinkList.java`, `Queue_Array_Linklist.java`, `BinarySearch_Trees.java` etc).
3. Run the `main` method of that class.
4. Observe output in the **console**.
   
 ## 👨‍🎓 Developer
- **Name:** Fatima
- **Course:** Data Structures & Algorithms
- **Language:** Java
- **Development Environment:** IntelliJ IDEA 

---
