# Data Structures and Algorithms - Semester Course Work

## 👨‍🎓 Student Information
- **Name:** [Your Name]
- **Language:** Java
- **Tools:** IntelliJ IDEA

---

## 📂 Project Structure & Implementation Details

Yeh repository un tamam algorithms aur data structures par mushtamil hai jo humne class mein cover kiye hain.

### 1. Searching Algorithms
Implementation of both iterative and recursive approaches.
* **Linear Search:** Both recursive (`Searching_Recursion.java`) and iterative methods.
* **Binary Search:** Implemented using recursion and iteration for sorted data.
* **Complexity:**
  - Linear Search: $O(n)$
  - Binary Search: $O(\log n)$



[Image of binary search algorithm flow]


### 2. Sorting Algorithms (`Sorting_Quick_Merge.java`)
High-performance sorting techniques:
* **Merge Sort:** A divide-and-conquer algorithm that splits the array and merges them in sorted order.
* **Quick Sort:** Uses a pivot element to partition the array.
* **Complexity:**
  - Merge Sort: $O(n \log n)$
  - Quick Sort (Average): $O(n \log n)$

### 3. Linked Lists (`DoublyLinklist.java`)
* **Doubly Linked List:** Each node contains data and two pointers (`next` and `prev`).
* **Operations:** `addFirst`, `addLast`, `deleteFirst`, `deleteLast`, and both forward/backward printing.



### 4. Stacks & Queues
* **Queue (`Queue_Array_Linklist.java`):** Array-based implementation with functions to find the maximum element, sum, and count.
* **Stack (`Stack_LinkList.java`):** Implementation using `ArrayList` and custom `Node` structures to manage LIFO operations.

### 5. Binary Search Trees (`BinarySearch_Trees.java`)
Comprehensive BST implementation including:
* **Traversals:** Inorder, Preorder, and Postorder.
* **Operations:** Insertion, Searching, Deletion (all cases), and finding the height of the tree.

---

## 📊 Complexity Summary Table

| Data Structure / Algorithm | Time Complexity (Average) | Space Complexity |
| :--- | :--- | :--- |
| **Linear Search** | $O(n)$ | $O(1)$ |
| **Binary Search** | $O(\log n)$ | $O(1)$ |
| **Merge Sort** | $O(n \log n)$ | $O(n)$ |
| **BST Operations** | $O(\log n)$ | $O(h)$ |
| **Linked List (Insert/Delete)**| $O(1)$ | $O(1)$ |

---

## 🚀 How to Run
1. Make sure you have **JDK** installed.
2. Compile any file:
   ```bash
   javac FileName.java
