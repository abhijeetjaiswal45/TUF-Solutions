# [377. Minimum Bit Flips to Convert Number](https://takeuforward.org/practice/dsa/minimum-bit-flips-to-convert-number)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given two integers start and goal. Flip the **minimum** number of bits of start integer to convert it into goal integer.

A bits flip in the number val is to choose any bit in binary representation of val and flipping it from either 0 to 1 or 1 to 0.

### Example 1:

**Input:** start = 10 , goal = 7

**Output:** 3

**Explanation:** The binary representation of 10 is "<u>10</u>1<u>0</u>".

The binary representation of 7 is "111".

If we flip the underlined bits in binary representation of 10 then we will obtain our goal.

### Example 2:

**Input:** start = 3 , goal = 4

**Output:** 3

**Explanation:** The binary representation of 3 is "011".

The binary representation of 4 is "100".

So if we flip all the three bits of 3 then we will reach our goal number.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= start , end <= 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
