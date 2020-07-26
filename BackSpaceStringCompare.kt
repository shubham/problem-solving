fun main() {
    print(
        backspaceCompare(
            "xywrrmp"
            , "xywrrmu#p"
        )
    )
}

fun backspaceCompare(S: String, T: String): Boolean {
    var i = S.length - 1
    var j = T.length - 1
    while (i >= 0 || j >= 0) {
        i = backspace(S, i)
        j = backspace(T, j)
        if (i < 0 && j < 0)
            return true
        if (i < 0 || j < 0 || S[i] != T[j])
            return false
        i--
        j--
    }
    return true
}

private fun backspace(S: String, i: Int): Int {
    var j = i
    var skip = 0
    while (j >= 0 && (skip > 0 || S[j] == '#')) {
        if (S[j] == '#')
            skip++
        else
            skip--
        j--
    }
    return j
}