import kotlin.math.pow

fun convertToNumber(list: MutableList<String>, start: Int, end: Int): Int {
    var k = 0
    var number = 0
    var j = start - 1
    while (j < end) {
        number = (number + (list[j].toInt().times(2.0.pow(k).toInt())))
        k++
        j++
    }
//    print(number)
    return number
}

fun main() {
    val firstLine = readLine()!!

    val numList = firstLine.split(" ")
    val queries = numList[1].toInt()

    val input = readLine()!!
    val inputArray = input.split(' ').toMutableList()

    var i = 0
    var queryInput = " "
    var queryInputArray: MutableList<String> = mutableListOf()
    while (i < queries) {
        queryInput = readLine()!!
        queryInputArray = queryInput.split(' ') as MutableList<String>

        when (queryInputArray[0]) {
            "0" -> {
                if (inputArray[queryInputArray[2].toInt() - 1] == "0")
                    println("EVEN")
                else
                    println("ODD")
            }
            "1" -> {
                // print(inputArray)
                if (inputArray[queryInputArray[1].toInt() - 1] == "0") {
                    inputArray[queryInputArray[1].toInt() - 1] = "1"
                } else {
                    inputArray[queryInputArray[1].toInt() - 1] = "0"
                }
            }
        }
        i++
    }
}
