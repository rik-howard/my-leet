
let assert = require ("assert");
let Solution = require ("Solution");
let tests = [
    solutionWorks
];

function solutionWorks () {
    let original = null;
    let expected = null;
    let actual = Solution.${function} (original);
    assert.equal (actual, expected);
}

for (var i = 0; i < tests.length; i++) tests [i] ();
