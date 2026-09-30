# [392. Maximum Nesting Depth of the Parentheses](https://takeuforward.org/practice/dsa/maximum-nesting-depth-of-the-parentheses)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A string s is a **valid parentheses string (VPS)** if it meets the following conditions:

- It only contains digits 0-9, arithmetic operators +, -, *, /, and parentheses (, ).
- The parentheses are **balanced** and **correctly** nested.

Your task is to compute the **maximum nesting depth of parentheses** in s. The nesting depth is the highest number of parentheses that are open at the same time at any point in the string.

### Example 1:

**Input:** s = "(1+(2*3)+((8)/4))+1"

**Output:** 3

**Explanation:** The deepest nested sub-expression is ((8)/4), which has 3 layers of parentheses.

### Example 2:

**Input:** s = "(1)+((2))+(((3)))"

**Output:** 3

**Explanation:** The digit '3' is enclosed in 3 pairs of parentheses.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 100
- s consists of digits 0-9, arithmetic operators (+, -, *, /), and parentheses ( and ).
- It is guaranteed that s is a valid parentheses string (VPS).

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
