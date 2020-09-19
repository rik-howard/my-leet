
let assert = require ("assert");
let Solution = require ("Solution");
let tests = [example1, example2, example3, extra1, extra2, extra3, extra4];

function example1 () {
    let original = 121;
    let expected = true;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function example2 () {
    let original = -121;
    let expected = false;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function example3 () {
    let original = 10;
    let expected = false;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function extra1 () {
    let original = 0;
    let expected = true;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function extra2 () {
    let original = 99;
    let expected = true;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function extra3 () {
    let original = 455;
    let expected = false;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

function extra4 () {
    let original = 56765;
    let expected = true;
    let actual = Solution.isPalindrome (original);
    assert.equal (actual, expected);
}

for (var i = 0; i < tests.length; i++) tests [i] ();
