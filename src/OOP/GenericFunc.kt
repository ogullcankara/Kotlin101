package OOP

import kotlin.math.max

fun main() {
    printRepeaeted("TEST",5)

    var list = arrayOf(1,2,3,4,5)
    var list2 = arrayOf("Kotlin","Java","Javascript","Dart")
    var list3 = arrayOf(2.6,3.6,5.8,8.7)

    printArray(list)

    list2.printArrayExt()

    var sonuc = maximum(1.7,7.3,2.3)
    println(sonuc)
}

fun<T> printRepeaeted(t: T, k: Int){
    for (items in 0..k) println(t)
}

fun <T> printArray(myArray: Array<T>) {
    for (items in myArray) println(items)
}

fun<T> Array<T>.printArrayExt() {
    for(items in this) println(items)
}

fun <T: Comparable<T>> maximum(x: T, y: T, z: T): T {
    var max = x
    if (y.compareTo(max) > 0) max = y
    if (z.compareTo(max) >0) max = z
    return max
}