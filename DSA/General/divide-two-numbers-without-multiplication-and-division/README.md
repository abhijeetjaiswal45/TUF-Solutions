# [314. Divide two numbers without multiplication and division](https://takeuforward.org/practice/dsa/divide-two-numbers-without-multiplication-and-division)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given the two integers, **dividend** and **divisor** . Divide without using the mod, division, or multiplication operators and return the **quotient** .

The fractional portion of the integer division should be lost as it truncates toward zero.

As an illustration, 8.345 and -2.7335 would be reduced to 8 and -2 respectively.

**Note** : Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem, if the quotient is strictly greater than 2^31 - 1, then return 2^31 - 1, and if the quotient is strictly less than -2^31, then return -2^31.

### Example 1:

**Input:** Dividend = 10 , Divisor = 3

**Output:** 3

**Explanation:** 10/3 = 3.33 , truncated to 3.

### Example 2:

**Input:** Dividend = 7 , Divisor = -3

**Output:** -2

**Explanation:** 7/-3 = -2.33 , truncated to -2.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- -2^31 <= dividend , divisor <= 2^31 - 1
- divisor != 0

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
