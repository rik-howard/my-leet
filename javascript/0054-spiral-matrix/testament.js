
let assert = require ("assert");
let Solution = require ("Solution");

let tests = [
    testSpiralOrderO,
    testSpiralOrderI,
    testSpiralOrderZ,
    testSpiralOrderE,
    testSpiralOrderU,
    testSpiralOrderS,
    testSpiralOrderC,
    testSpiralOrderV,
    testSpiralOrderH,
    testSpiralOrderG,
    testSpiralOrderD
];

function testSpiralOrderD () {
    let original = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]];
    let expected = [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (actual, expected);
}

function testSpiralOrderG () {
    let original = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
    let expected = [1, 2, 3, 6, 9, 8, 7, 4, 5];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (actual, expected);
}

function testSpiralOrderH () {
    let original = [[0, 1], [2, 3], [4, 5]];
    let expected = [0, 1, 3, 5, 4, 2];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (actual, expected);
}

function testSpiralOrderV () {
    let original = [[0, 1], [2, 3]];
    let expected = [0, 1, 3, 2];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (actual, expected);
}

function testSpiralOrderC () {
    let original = [[0], [1]];
    let expected = [0, 1];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (expected, actual);
}

function testSpiralOrderS () {
    let original = [[0, 1]];
    let expected = [0, 1];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (expected, actual);
}

function testSpiralOrderU () {
    let original = [[0]];
    let expected = [0];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (expected, actual);
}

function testSpiralOrderE () {
    let original = [[], []];
    let expected = [];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (expected, actual);
}

function testSpiralOrderZ () {
    let original = [];
    let expected = [];
    let actual = Solution.spiralOrder (original);
    assert.deepEqual (expected, actual);
}

function testSpiralOrderI () {
    let original = [[0], [1, 2]];
    let expected = `not rectangular: 0,1,2`;
    try {
        let throwing = Solution.spiralOrder (original);
        throw `shouldn't be here`;
    }
    catch (e) {
        let actual = e;
        assert.equal (expected, actual);
    }
}

function testSpiralOrderO () {
    let original = 0;
    let expected = `not an array: 0`;
    try {
        let throwing = Solution.spiralOrder (original);
        throw `shouldn't be here`;
    }
    catch (e) {
        let actual = e;
        assert.equal (expected, actual);
    }
}

// doesn`t work
// for (test in tests) test ();

// but this does
for (var i = 0; i < tests.length; i++) tests [i] ();
