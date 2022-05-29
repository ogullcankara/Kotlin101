package OOP

fun main() {
    var list = listOf(1,2,3,4,5,6,7,8,9,10)
    var list2 = list.filter { it > 8 }
    println(list2)
    list2.printArray1()
    println()

    var list3 = list.map { it * 2 } //listenin elemeanları üzerinde işlem yapar
    list3.printArray1()
    println()

    var a = list.all { it > 5 } //verilen şartı tün elenmanlar sağlıyorusa true, sağlamıyorsa false döner
    println(a)
    println()

    var b = list.any { it > 5 } //verilen şartı listedeki herhangi bir eleman sağlıyorsa true, sağlamıyorsa false döner
    println(b)
    println()

    var c = list.count { it > 6 } // verilen şartı sağlayan elemanların sayısını döner.
    println(c)
    println()

    var d = list.find { it > 4 } //verilen şartı sağlayan listedeki ilk elemanı döner
    println(d)
    println()
}

fun <T> List<T>.printArray1() {
    for(items in this) {
        println(items)
    }
}