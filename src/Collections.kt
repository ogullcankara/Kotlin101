fun main() {
    var array = Array<Int>(5) {0}
    var array2 = arrayOf(1,2,3)
    println(array2[2])
    array2[2] = 4
    println(array2[2])

    for (items in array2) println(items)

    //List - immutable, sabit
    var list = listOf<String>("a","b","c","d")
    //list[2] = "x" değiştirilemez

    for (item in list) println(item)
    println("-----")
    for (item in 0..list.size-1) println(item)
}