fun main(vararg args: String) {
    val str = readLine()!!
    var t=str.toInt()
    var input = readLine()
    var count=0
    var lastProcess="-1"
   while ( input != null){
       var inputList= input.split(" ")
//       println("${inputList[0]} ${inputList[1]} ${inputList[2]}")
       if (inputList[0].toInt()> t){
           print( lastProcess)
           break
       }
       if ("running" == inputList[2] && inputList[0].toInt()<= t){
           ++count
           lastProcess=inputList[1]
       }
       input= readLine()!!
   }
}

