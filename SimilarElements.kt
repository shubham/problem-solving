import java.util.*

fun main() {
    var scanner: Scanner = Scanner(System.`in`)
    var number = scanner.nextInt()
    var i = 0
    var input: Array<Int> = Array(number) { 0 }
    while (i < number) {
        input[i] = scanner.nextInt()
        i++
    }
    input.sort()
  //  input.forEach { print(it) }
    //println()
    var x = 1
    var count = 0
    i = 0
    var k = 0
    while (i < number - 1) {
        //println(" input [$i]= ${input[i]} , x= $x  count= $count  k= $k")
        if (input[i + 1] - input[i] == 1) {
            x++
        } else if (input[i + 1] == input[i]) {
            x++
            k++
        } else {
            if (k != x) {
                count += ((x * (x - 1)) / 2)
                x = 0
                k = 0
            }
        }
        //println(" input [$i]= ${input[i]} , x= $x  count= $count  k= $k")
        i++
      //  println(" $count  ")
    }
    if (k != x) {
        count += ((x * (x - 1)) / 2)
    }
    println(count)
}