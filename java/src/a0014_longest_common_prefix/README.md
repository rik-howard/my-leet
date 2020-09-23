


# Leet Algorithms 14 [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix)
Java


## 2020-09-23
* [Solution](Solution.java)
* [Testament](Testament.java)


## Leet says
* Runtime: 7 ms, faster than 20.77% of Java online submissions for Longest Common Prefix.
* Memory Usage: 39.2 MB, less than 27.63% of Java online submissions for Longest Common Prefix.


## Scratch
* All input is lower-case a-z
* find length of shortest string in input
* while shortest string is not empty
    * test character becomes initial of shortest string
    * if all other strings have same initial, append test to output string
    * otherwise, return output string
    * other strings become other strings less initial character
    * shortest string becomes shortest string less initial character
    * loop again
* return output string, if we get here

Functions

    output = ""
    shortestStringInitial (input) -- (first) shortest of input
    otherStringsInitial (input) -- input less shortest
    shortestString (shortestString) -- removes initial of shortest
    otherStrings (otherStrings) -- removes initial of each string
    testCharacter (shortestString) -- removes tail of string
