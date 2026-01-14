# Data Structures and Algorithms - Course Work

## 👨‍🎓 Student Information
- **Name:** [Your Name]
- **Course:** Data Structures & Algorithms
- **Language:** Java
- [cite_start]**Development Environment:** IntelliJ IDEA [cite: 1]

---

## 📂 Repository Contents & Implementation Details

This repository contains Java implementations of fundamental data structures and algorithms covered throughout the semester.

### 1. Searching Algorithms
I have implemented both iterative and recursive searching techniques:
* **Linear Search:** Implemented recursively in `Searching_Recursion.java` and iteratively in `SearchingIterative.java`.
* **Binary Search:** Implemented for sorted arrays using both recursion and iteration.
* **Time Complexity:** - Linear Search: $O(n)$
  - Binary Search: $O(\log n)$



[Image of binary search algorithm flow]


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
1. Ensure you have the **Java Development Kit (JDK)** installed.
2. Open the project in **IntelliJ IDEA** or use the terminal.
3. To compile via terminal:
   ```bash
   javac FileName.java
