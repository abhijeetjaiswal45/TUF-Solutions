# [24. Jump Game - I](https://takeuforward.org/practice/dsa/jump-game---i)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers nums, each element in the array represents the maximum jump length at that position. Initially starting at the first index of the array, determine if it is possible to **reach** the last index. Return **true** if the last index can be reached, otherwise return **false** .

### Example 1:

**Input:** [2, 3, 1, 1, 4]

**Output:** true

**Explanation:** We can simply take Jump of 1 step at each index to reach the last index.

### Example 2:

**Input:** [3, 2, 1, 0, 4]

**Output:** false

**Explanation:** No matter how you make jumps you will always reach the third index (0 base) of the array.

The maximum jump of index three is 0, So you can never reach the last index of array.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^4
- 0 <= nums[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
