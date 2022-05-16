import java.util.ArrayList

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

    var arrayList1 = arrayListOf<String>("x","y","z","t","q")
    arrayList1[3] = "TEST"
    arrayList1.add("JS")
    arrayList1.remove("x")

    for (items in arrayList1) println(items)

    //Immutable Map -> key value ,sabit

    var map = mapOf<Int, String>() // Immutable, sabit eleman
    var map2 = mapOf<Int, String>(10 to "X", 12 to "Y", 14 to "Z", 16 to "T")

    for (key in map2.keys) println("Key : $key Value : ${map2[key]}")
    println()

    //Mutable Map -> key value ,değişken - dinamik

    var map3 = HashMap<Int, String>()

    map3.put(1, "T1")
    map3.put(2, "T2")
    map3.put(3, "T3")
    map3.put(4, "T4")

    for (key in map3.keys) println("Key : $key Value : ${map3[key]}")
    map3.replace(1,"TEST")
    println()
    for (key in map3.keys) println("Key : $key Value : ${map3[key]}")


    var map4 = hashMapOf<Int, String>(1 to "A", 2 to "B", 3 to "C", 4 to "D")

    println()
    for (key in map4.keys) println("Key : $key Value : ${map4[key]}")

    var map5 = mutableMapOf<Int, String>(10 to "A", 20 to "B", 30 to "C", 40 to "D") //Veriler sıralı gelir
    println()
    for (key in map5.keys) println("Key : $key Value : ${map5[key]}")

    //Set unique veriler

    var set = setOf<Int>(1,2,3,4,5,6,6,2)
    println()
    println(set.size)

    var set2 = mutableSetOf<Int>(1,1,2,3,4,4,5,5)
    set2.add(9)

    for (item in set2) println(item)
    set2.remove(4)

    println()
    for (item in set2) println(item)

    var set3 = hashSetOf<Int>(1,2,3,3,4,4,5,5,6,7)

    println()
    for (item in set3) println(item)



}