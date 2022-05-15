fun main() {
    var sonuc = topla(4,2)
    println(sonuc)
    var sonuc2 = bol(4,2)
    println(sonuc2)

    var sonuc3 = hesapla(5,4,"+")
    println(sonuc3)
}

fun topla(sayi1 : Int, sayi2 : Int) : Int = sayi1 + sayi2
fun cikar(sayi1: Int, sayi2: Int) : Int = sayi1 - sayi2
fun carp(sayi1: Int, sayi2: Int) : Int = sayi1 * sayi2
fun bol(sayi1: Int, sayi2: Int) : Int = sayi1 / sayi2

fun hesapla(sayi1: Int, sayi2: Int, islem : String) : Int = when(islem){
    "+" -> sayi1 + sayi2
    "-" -> sayi1 - sayi2
    "*" -> sayi1 * sayi2
    "/" -> sayi1 / sayi2
    else -> 0


}
