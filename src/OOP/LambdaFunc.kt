package OOP

fun main() {
    hello1()
    hello2()

    topla1(1,4)
    topla2(5,6)

   var sonuc1 = max(12,4)
    println(sonuc1)
    var sonuc2 = max2(22,55)
    println(sonuc2)

    max3(4,56)

    var myLambda: (String, String) -> Unit = {ad, soyad ->
        println("Ad : $ad Soyad : $soyad")
    }

    var myLambda2 = {ad: String, soyad: String ->
        println("Ad : $ad Soyad : $soyad")
    }

    myLambda("İbrahim","Kara")
    myLambda2("Ogulcan","Kara")


    var list = listOf(1,2,3,4,5)
    list.forEach{ i -> println(i)}
    list.forEach { println(it) }

}

fun hello1(){
    println("Hrllo")
}

var hello2 = {println("hello")}

fun topla1(a: Int, b: Int): Unit = println(a +b)
val topla2 = {a: Int, b: Int -> println(a + b)}

fun max(a: Int, b: Int): Int = if (a > b) a else b
var max2 = { a: Int, b: Int -> if (a > b) a else b}
var max3 = { a: Int, b: Int -> if (a > b) println(a) else println(b)}