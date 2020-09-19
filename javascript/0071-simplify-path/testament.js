
let assert = require ("assert");
let Solution = require ("Solution");
let tests = [example1, example2, example3, example4, example5, example6, example7, example8];

function example1 () {
    let original = "/home/";
    let expected = "/home";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example2 () {
    let original = "/../";
    let expected = "/";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example3 () {
    let original = "/home//foo/";
    let expected = "/home/foo";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example4 () {
    let original = "/a/./b/../../c/";
    let expected = "/c";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example5 () {
    let original = "/a/../../b/../c//.//";
    let expected = "/c";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example6 () {
    let original = "/a//b////c/d//././/..";
    let expected = "/a/b/c";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example7 () {
    let original = "/...";
    let expected = "/...";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

function example8 () {
    let original = "/..hidden";
    let expected = "/..hidden";
    let actual = Solution.simplifyPath (original);
    assert.equal (actual, expected);
}

for (var i = 0; i < tests.length; i++) tests [i] ();
