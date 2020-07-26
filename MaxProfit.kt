fun main() {
    print(maxProfit(intArrayOf(0, 3, 8, 6, 8, 6, 6, 8, 2, 0, 2, 7)))
}

fun maxProfit(prices: IntArray): Int {
    if (prices.isNotEmpty()) {
        var maxValue = 0
        var minValue = 0
        var sum = 0

        var i = prices.size - 1
        while (i >= 0) {
            print("${prices[i]} : value current \n")

            print("$sum : in \n")

            if (prices[i] < minValue) {
                minValue = prices[i]
            } else if (prices[i] > (minValue) && prices[i] < maxValue) {
                sum += (maxValue - minValue)
                maxValue = prices[i]
                minValue = prices[i]
            } else if (prices[i] >= maxValue) {
                sum += (maxValue - minValue)
                maxValue = prices[i]
                minValue = prices[i]
            }
            i -= 1
            print("$sum  :out \n")
        }

        sum += (maxValue - minValue)

        return sum
    } else {
        return 0
    }

}