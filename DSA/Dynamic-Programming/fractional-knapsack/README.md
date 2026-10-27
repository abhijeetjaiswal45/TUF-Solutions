# [174. Fractional Knapsack](https://takeuforward.org/practice/dsa/fractional-knapsack)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You have n items; the i-th item has value val[i] and weight wt[i].

A knapsack can carry at most capacity units of weight.

You may take any fraction of an item (i.e. split items).

Return the maximum total value that can be placed in the knapsack, rounded to exactly 6 decimal places.

### Example 1:

**Input:** &nbsp;val = [60,100,120],&nbsp;wt = [10,20,30],&nbsp;capacity = 50

**Output:** 240.000000

**Explanation:**

&nbsp;• Take item 0&nbsp;(w=10, v=60)

&nbsp;• Take item 1&nbsp;(w=20, v=100)

&nbsp;• Take 2⁄3 of item 2 (w=20, v=80)

Total value = 60 + 100 + 80 = 240

### Example 2:

**Input:** &nbsp;val = [60,100],&nbsp;wt = [10,20],&nbsp;capacity = 50

**Output:** 160.000000

**Explanation:** Both items fit entirely (total weight 30 ≤ 50).

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ n = val.length = wt.length ≤ 10^5
- 1 ≤ capacity ≤ 10^9
- 1 ≤ val[i], wt[i] ≤ 10 000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
