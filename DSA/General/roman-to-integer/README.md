# [87. Roman to Integer](https://takeuforward.org/practice/dsa/roman-to-integer)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Roman numerals are represented by seven different symbols:

- I = 1
- V = 5
- X = 10
- L = 50
- C = 100
- D = 500
- M = 1000

Roman numerals are typically written from largest to smallest, left to right. However, in specific cases, a smaller numeral placed before a larger one indicates subtraction.

The following subtractive combinations are valid:

- I before V (5) and X (10) → 4 and 9
- X before L (50) and C (100) → 40 and 90
- C before D (500) and M (1000) → 400 and 900

Given a Roman numeral, convert it to an integer.

### Example 1:

**Input:** s = "III"

**Output:** 3

**Explanation:** III = 1 + 1 + 1 = 3

### Example 2:

**Input:** s = "XLII"

**Output:** 42

**Explanation:** XL = 40, II = 2 → 40 + 2 = 42

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M')
- It is guaranteed that s is a valid Roman numeral in the range [1, 3999]

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
