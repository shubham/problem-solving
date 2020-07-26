import java.util.*

fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    findAllPairs(scanner.nextInt())
}

fun findAllPairs(n: Int) {
    val pairArray = CharArray(2 * n)
    var pairsList = mutableListOf<CharArray>()
   pairsList= printAllPairs(pairArray, 0, 0, 0, n, pairsList)
    pairsList.reverse()
//    for
    print(n)
}

fun printAllPairs(
    pairArray: CharArray,
    start: Int,
    end: Int,
    position: Int,
    n: Int,
    pairsList: MutableList<CharArray>
):MutableList<CharArray> {
    if (end == n) {
        pairsList.add(pairArray)
        return pairsList
    } else {
        if (start > end) {
            pairArray[position] = ')'
            printAllPairs(pairArray, start, end + 1, position + 1, n,pairsList)
        }
        if (start < n) {
            pairArray[position] = '('
            printAllPairs(pairArray, start + 1, end, position + 1, n,pairsList)
        }
//        print("$n, $start, $end, $position")
    }
    return pairsList
}
