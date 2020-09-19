
exports.simplifyPath = function (path) {
    return solution (path);
};

function solution (path) {
    var canonical = [];
    var absolute = normal (path);
    //console.log (absolute);
    while (absolute.length > 1)
        if (absolute.match (/^\/\.\//)) [absolute, canonical] = caseDot (absolute, canonical, absolute.match (/^\/\./) [0]);
        else if (absolute.match (/^\/\.\.\//)) [absolute, canonical] = caseDots (absolute, canonical, absolute.match (/^\/\.\./) [0]);
        else if (absolute.match (/^\/[^/]*/)) [absolute, canonical] = caseWord (absolute, canonical, absolute.match (/^\/[^/]*/) [0]);
        else throw `unrecognised beginning: ${absolute}`
    canonical = canonical.join ("");
    return canonical == ""? "/":
    //canonical.substring (canonical.length - 1) == "/"? canonical.substring (0, -1):
    canonical;
}

function caseDot (absolute, canonical, match) {
    absolute = absolute.substring (match.length);
    return [absolute, canonical];
}

function caseDots (absolute, canonical, match) {
    absolute = absolute.substring (match.length);
    if (canonical.length > 0) canonical = canonical.slice (0, canonical.length - 1);
    return [absolute, canonical];
}

function caseWord (absolute, canonical, match) {
    absolute = absolute.substring (match.length);
    canonical.push (match);
    return [absolute, canonical];
}

function normal (path) {
    path = path.replace (/\/+/g, "/");
    if (path.substring (path.length - 1) != "/")
        path = path.concat ("/");
    return path;
}
