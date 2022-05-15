fun main() {

    10 downTo 1 //infix
    10.downTo(4) //extension
    var sonuc = 3 topla 4
    println(sonuc)
    var sonuc2 = 2.topla(3)
    println(sonuc2)

    println("Test".birlestir(" Kotlin"))
}

infix fun Int.topla(sayi : Int) : Int = this + sayi

infix fun String.birlestir(metin: String) = this + metin