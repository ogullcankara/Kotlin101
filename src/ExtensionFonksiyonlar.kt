fun main() {

    print("Bir Sayi Giriniz : ")
    var x  = readLine()!!.toInt()
    var sonuc =ucleCarp(x)
    println(sonuc)
    println("Extension")
    println(5.ucleCarpExtension())
    println(4.ucleCarpExtension())
    println("kotlin".reversed())

    var list = arrayListOf("Kotlin","Java","JS")
    for (item in list) println(item)
    println("--------")
    list.swap(0,2)
    for (item in list) println(item)

}

    fun ucleCarp(sayi: Int) : Int = sayi * 3

    fun Int.ucleCarpExtension() = this * 3

    fun ArrayList<String>.swap(x : Int, y: Int){
        var temp = this[x]
        this[x] = this[y]
        this[y] = temp
}