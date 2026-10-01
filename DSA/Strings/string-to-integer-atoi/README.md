# [49. String to Integer (atoi)](https://takeuforward.org/practice/dsa/string-to-integer-atoi)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Implement the function **myAtoi(s)** which converts the given string s to a 32-bit signed integer **(similar to the C/C++ atoi function).**

**Steps to Implement:**

- First, **ignore** any leading **whitespace** characters ' ' until the first non-whitespace character is found.
- Check the next character to determine the sign. If it’s a '-', the number should be **negative** . If it’s a '+', the number should be **positive** . If neither is found, **assume** the number is **positive** .
- Read the digits and convert them into a number. **Stop** reading once a **non-digit characte** r is encountered or the end of the string is reached. **Leading zeros** should be **ignored** during conversion.
- The result should be **clamped** within the **32-bit** **signed integer** range: [-2147483648, 2147483647]. If the computed number is outside this range, return -2147483648 if the number is less than -2147483648, or return 2147483647 if the number is greater than 2147483647.
- Finally, return the computed number after applying all the above steps.

### Example 1:

**Input:** s = " -12345"

**Output:** -12345

**Explanation:**

- Ignore leading whitespaces.
- The sign '-' is encountered, indicating the number is negative.
- Digits 12345 are read and converted to -12345.

### Example 2:

**Input:** s = "4193 with words"

**Output:** 4193

**Explanation:**

- Read the digits 4193 and stop when encountering the first non-digit character (w).

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 0 ≤ s.length ≤ 200
- s consists of English letters (both lowercase and uppercase), Digits '0' to '9', Characters: ' ', '+', '-', and '.'

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
