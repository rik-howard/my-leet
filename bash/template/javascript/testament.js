
let assert = require ("assert");
let Solution = require ("Solution");
let tests = [
    solutionWorks
];

function solutionWorks () {
    let original = null;
    let expected = null;
    let actual = Solution.${function} (original);
    assert.equal (expected, actual);
}

for (var i = 0; i < tests.length; i++) tests [i] ();
