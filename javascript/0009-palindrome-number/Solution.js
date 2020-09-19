
exports.isPalindrome = function (x) {
    return solution (x);
};

function solution (x) {
    if (x < 0) return false;
    else return isPalindrome0 (x, digitCount (x));
}

function isPalindrome0 (x, dc) {
    if (dc == 1) return true;
    else return isPalindrome1 (x, dc, leastSignificant (x), mostSignificant (x, dc));
}

function isPalindrome1 (x, dc, ls, ms) {
    if (dc == 2) return ls == ms;
    else if (ls == ms) return isPalindrome0 (nextInteger (x, dc), dc - 2)
    else return false;
}

function digitCount (x) {
    i = 1;
    while (10 ** i <= x) i += 1;
    return i;
}

function leastSignificant (x) {
    return x % 10;
}

function mostSignificant (x, dc) {
    return Math.floor (x / 10 ** (dc - 1));
}

function nextInteger (x, dc) {
    return Math.floor (x % 10 ** (dc - 1) / 10);
}
