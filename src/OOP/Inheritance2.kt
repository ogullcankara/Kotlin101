package OOP

fun main() {

    var ogretmen = Ogretmen("Ogulcan",25)
    ogretmen.dersVer()
    println()

    var sporcu = Sporcu("Ali",34)
    sporcu.sporYap()
    println()

    var isAdami = IsAdami("Emir",26)
    isAdami.calisma()
    println()
}

open class Kisi(var name : String, var age : Int){
    init {
        println("Ad : $name")
        println("Yaş : $age")
    }
}

class Ogretmen(name : String, age : Int) : Kisi(name, age) {
    fun dersVer() = println("$name ders verildi.")
}

class Sporcu(name: String, age: Int) : Kisi(name, age) {
    fun sporYap() = println("$name spor yapıldı.")
}

class IsAdami(name: String, age: Int) : Kisi(name, age) {
    fun calisma() = println("$name çalışıyor.")
}