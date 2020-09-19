
/**
 * @param {number [] []} matrix
 * @return {number []}
 */

exports.spiralOrder = function (matrix) {
    return solution (matrix);
}

/*
 * Row = [field: field ∊ Natural]
 * Matrix = [row: row ∊ Row]
 */

function solution (matrix) {
    if (Array.isArray (matrix))
        if (isRectangular (matrix)) return spiral (matrix);
        else throw `not rectangular: ${matrix}`;
    else throw `not an array: ${matrix}`;
}

// Matrix → Row
function spiral (matrix) {
    [matrix, output] = [matrix, []];
    while (matrix.length > 0) {
        if (matrix.length > 0) [matrix, output] = fore (matrix, output);
        if (matrix.length > 0) [matrix, output] = down (matrix, output);
        if (matrix.length > 0) [matrix, output] = back (matrix, output);
        if (matrix.length > 0) [matrix, output] = up   (matrix, output);
    }
    return output;
}

// Matrix × Row → Matrix × Row
function fore (matrix, output) {
    for (var j = 0; j < matrix [0].length; j++)
        output.push (matrix [0] [j]);
    matrix = firstRowDropping (matrix);
    return [matrix, output];
}

function down (matrix, output) {
    for (var i = 0; i < matrix.length; i++)
        if (matrix [0].length > 0)
            output.push (matrix [i] [matrix [0].length - 1]);
    matrix = lastColumnDropping (matrix);
    return [matrix, output];
}

function back (matrix, output) {
    for (var j = matrix [0].length; j > 0; j--)
        output.push (matrix [matrix.length - 1] [j - 1]);
    matrix = lastRowDropping (matrix);
    return [matrix, output];
}

function up (matrix, output) {
    for (var i = matrix.length; i > 0; i--)
        //if (matrix [0].length > 0) -- think this is needed -- devise test!!!
            output.push (matrix [i - 1] [0]);
    matrix = firstColumnDropping (matrix);
    return [matrix, output];
}

// Matrix → Matrix
function firstRowDropping    (matrix) {return matrix.slice (1);}
function lastRowDropping     (matrix) {return matrix.slice (0, -1);}
function lastColumnDropping  (matrix) {return transposition (lastRowDropping (transposition (matrix)));}
function firstColumnDropping (matrix) {return transposition (firstRowDropping (transposition (matrix)));}

// Matrix → Matrix
function transposition (matrix) {
    result = []
    if (matrix.length > 0) {
        for (var i = 0; i < matrix [0].length; i++) {
            row = []
            for (var j = 0; j < matrix.length; j++) {
                row.push (matrix [j] [i]);
            }
            result.push (row);
        }
    }
    return result;
}

// Matrix → Boolean
function isRectangular (matrix) {
    if (matrix.length == 0) return true;
    else return isPostivelyRectangular (matrix);
}

function isPostivelyRectangular (matrix) {
    matrixWidth = matrix [0].length;
    reducer = (boolean, row) => boolean && (row.length == matrixWidth);
    return matrix.reduce (reducer, true);
}
