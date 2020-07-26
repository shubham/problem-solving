fun main() {
    var queries = readLine()!!
    var i = 0
    var input = ""
    while (i < queries.toInt()) {
        input = readLine()!!
        var j = 0
        var inputData: HashMap<Char, Int> = HashMap()
        while (j < input.length) {
            if (inputData.containsKey(input[j])) {
                inputData[input[j]]?.plus(1)?.let { inputData.put(input[j], it) }
            } else {
                inputData[input[j]] = 1
            }
            j++
        }
        var isPrime = false
        if (isPrime(inputData.size)) {
            j = 0
            var valueList = inputData.values.toMutableList()

            while (j < valueList.size) {
                if (!isPrime(valueList[j])) {
                    isPrime = false
                    break
                } else {
                    isPrime = true
                }
                j++
            }
        }
        if (isPrime) {
            println("YES")
        } else
            println("NO")
        i++
    }
}

fun isPrime(number: Int): Boolean {
    println(number)
    if (number == 1) {
        return false
    }
    var i = 2
    while (i < number) {
        if (number % i == 0) {
            return false
        }
        i++
    }
    return true
}