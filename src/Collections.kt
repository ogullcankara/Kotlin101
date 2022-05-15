fun main() {
    var array = Array<Int>(5) {0}
    var array2 = arrayOf(1,2,3)
    println(array2[2])
    array2[2] = 4
    println(array2[2])

    for (items in array2) println(items)
}