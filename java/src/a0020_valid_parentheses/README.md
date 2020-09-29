


# Leet Algorithms 20 [Valid Parentheses](https://leetcode.com/problems/valid-parentheses)
Java


## 2020-09-29
* [Solution](Solution.java)
* [Testament](Testament.java)


## Leet says:
* Runtime: 8 ms, faster than 5.70% of Java online submissions for Valid Parentheses.
* Memory Usage: 49.1 MB, less than 5.04% of Java online submissions for Valid Parentheses.

## Problem
Given a string, *s*, containing just the characters '(', ')', '{', '}', '[' and ']', determine whether the input string is valid.  An input string is valid if:

1. the same type of brackets close the open brackets;
1. the correct order closes the open brackets.

Constraints:

* 1 ≤ *s*.length ≤ 10⁴
* *s* consists of parentheses only '()[]{}'.


## Solution
* check constraints, invalid input string if:
    * string is null
    * string is zero-length
    * string length > 10⁴
    * string has invalid characters
* parse string, one character at a time
* if bracket is opener, push to a stack
* if bracket is closer, pop stack and check whether popped character matches opener
    * if so, continue
    * otherwise, return *false*

### Improvements
The solution is not very efficient.

* A marginal gain can be achieved by checking the length of the input string for evenness.
* It is probably better to stream the input string than to take its head and tail repeatedly.
