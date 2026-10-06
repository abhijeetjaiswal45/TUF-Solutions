# [927. Insert before given node in Doubly Linked List](https://takeuforward.org/practice/dsa/insert-before-given-node-in-dll)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a node's reference within a doubly linked list and an integer X, insert a node with value X before the given node in the linked list while preserving the list's integrity.

You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.

### Example 1:

**Input:** head = [1, 2, 6], node = 6, X = 7

**Output:** head = [1, 2, 7, 6]

**Explanation:** Note that the head was not given to the function.

### Example 2:

**Input:** head = [7, 5, 15], node = 5, X = 10

**Output:** head = [7, 10, 5, 15]

Explanation: The node with value 5 was referenced, thus the new node was added before the given node.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- n == Number of nodes in the Linked List
- 2 <= n <= 100
- 0 <= ListNode.val <= 100
- 0 <= X <= 100
- It is guaranteed the given node will be a part of a doubly linked list and will not be its head.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
