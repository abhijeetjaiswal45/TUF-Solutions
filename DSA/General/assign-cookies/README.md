# [104. Assign Cookies](https://takeuforward.org/practice/dsa/assign-cookies)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Consider a scenario where a teacher wants to distribute cookies to students, with each student receiving at most one cookie.

Given two arrays, **student** and **cookie** , the i^th value in the Student array describes the minimum size of cookie that the ith student can be assigned. The j^th value in the Cookie array represents the size of the j^th cookie. If **Cookie[j] >= Student[i]** , the j^th cookie can be assigned to the i^th student.

**Maximize** the number of students assigned with cookies and output the maximum number.

### Example 1:

**Input:** student = [1, 2, 3] , cookie = [1, 1]

**Output:** 1

**Explanation:** You have 3 students and 2 cookies.

The minimum size of cookies required for students are 1 , 2 ,3.

You have 2 cookies both of size 1, So you can assign the cookie only to student having minimum cookie size 1.

So your answer is 1.

### Example 2:

**Input:** student = [1, 2] , cookie = [1, 2, 3]

**Output:** 2

**Explanation:** You have 2 students and 3 cookies.

The minimum size of cookies required for students are 1 , 2.

You have 3 cookies and their sizes are big enough to assign cookies to all students.

So your answer is 2.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= student.length <= 3*10^4
- 0 <= cookie.length <= 3*10^4
- 1 <= student[i] , cookie[j] <= 2^31 - 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
