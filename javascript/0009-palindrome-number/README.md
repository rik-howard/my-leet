


# Leet Algorithms 9 [Palindrome Number](https://leetcode.com/problems/palindrome-number)
JavaScript: from the folder with this read-me,

    node testament.js


## 2020-09-19
* [Solution](Solution.js)
* [testament](testament.js)

Leet says:

* Runtime: 240 ms, faster than 42.83% of JavaScript online submissions for Palindrome Number.
* Memory Usage: 46.8 MB, less than 41.93% of JavaScript online submissions for Palindrome Number.


## Scratch
* Constraint: solve without converting integer to a string!
* Obsrvation: no negative integers are palindromes.
* Possibly: (assuming base 10)
    * get last digit by taking x mod 10
    * get leading digit by ...?
        * repeatedly dividing by 10 until ... (yuck)
        * hm, think that's it

Functions

    digitCount x -- determines how many digits x has; e.g., 10^1 < 91 < 10^2 ∴ 91 has two digits

    leastSignificant x -- x mod 10; e.g., leastSignificant 123 = 3
    mostSignificant x -- x div 10^(digitCount - 1); e.g., dc 123 = 3 ∴ ms 123 = 123 div 10^(3 - 1) = 1

    digitsMatch -- ls = ms

    nextInteger x -- dm, this returns the bit in between; e.g., ni 121 = 2
        ni x = x mod 10^(dc - 1) div 10

    isPalindrome x dc --
        if dc = 1, true
        else if dc = 2, return ls = ms
        else
            ls = ...
            ms = ...
            if dm,
                ni = ...
                dc -= 2
                isPalindrome ni dc
            else, false

REPL

    > Math.floor (123 / 100)
    1

    > 10 ** 2
    100

    > i = 1
    1
    > x = 12321
    12321
    > while (10 ** i < x) i += 1; i
    5

    > x = 121
    121
    > dc = 3
    3
    > x % 10 ** (dc - 1)
    21
    > x % 10 ** (dc - 1) / 10
    2.1
    > Math.floor (x % 10 ** (dc - 1) / 10)
    2

Example

    isPalindrome 121
    => dc = 3; ls = 1; ms = 1; dm; ni = 2
    etc.
