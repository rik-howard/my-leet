


# Leet Algorithms 71 [Simplify Path](https://leetcode.com/problems/simplify-path)
JavaScript: from the folder with this read-me,

    node testament.js


## 2020-09-18
* [Solution](Solution.js)
* [testament](testament.js)

### Leet says
* Runtime: 76 ms, faster than 96.62% of JavaScript online submissions for Simplify Path.
* Memory Usage: 42.2 MB, less than 7.21% of JavaScript online submissions for Simplify Path.

### Scratch

    canonical = []
    absolute = normal (path)  // only single slashes, always ends with slash

    while length (absolute) > 1
        if matches (absolute, ^/./):
            absolute = absolute / (^.)
        else if matches (absolute, ^/../):
            absolute = absolute / (^..)
            pop (canonical, junk)
        else if matches (absolute, ^/[^/]+/):
            absolute = absolute / (^[^/]+)
            push (^[^/]+, canonical)
        else: throw

    canonical = canonical.join ()
    return canonical == ""? "/": canonical

REPL

    > var absolute = "//../"
    > absolute.match ("^/+")
    [ '//', index: 0, input: '//../', groups: undefined ]
    > absolute.match ("^[a-z]+")
    null
    > absolute.match ("^/+") [0]
    '//'
    > absolute.match ("^/+") [0].length
    2
    > absolute.substring (absolute.match ("^/+") [0].length)
    '../'

    > var canonical = ""
    > canonical
    ''
    > canonical.concat ("/")
    '/'

    > can = ["/", "home", "/", "rik"]
    [ '/', 'home', '/', 'rik' ]
    > can.join ()
    '/,home,/,rik'
    > can.join ("")
    '/home/rik'

    > "/home".match (/^\/+/)
    ['/', index: 0, input: '/home', groups: undefined]
    > "/home/".match (/^\/+/)
    ['/', index: 0, input: '/home/', groups: undefined]
    > "home/".match (/^\/+/)
    null
    > "home/".match (/^[a-z]+/)
    ['home', index: 0, input: 'home/', groups: undefined]
