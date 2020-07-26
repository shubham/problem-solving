fun main() {
    var sequence = readLine()!!
    var i = 0
    var count = 0
    while (i < sequence.length) {
        if (sequence[i] == '(')
            if (validateSequence(sequence, i))
                count++
        i++
    }
    print(count)

}

fun validateSequence(sequence: String, num: Int): Boolean {
    var position = num
    var count = 0
    var i = 0
    while (i < sequence.length) {
        if (sequence[position] == '(') {
            count++
        }
        if (sequence[position] == ')') {
            count--
            if (count < 0)
                return false
        }
        if (position == sequence.length - 1) {
            position = 0
        } else {
            position++
        }
        i++
    }
    return count == 0
}