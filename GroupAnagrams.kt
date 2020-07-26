fun main() {

    print(groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>>? {

    var strsCopy = strs
    var hashMap: HashMap<String, List<String>> = HashMap()

    var i = 0
    while (i < strsCopy.size) {
        var data = strsCopy[i]
//        data = data.toSortedSet().tos
        print("$data \n")
        strsCopy[i] = data
        i++
    }

    return null
}