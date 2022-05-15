fun main() {

    var ustSinir : Int
    var bolenSayisi : Int
    println("Üst Sınır Giriniz : ")
    ustSinir = readLine()!!.toInt()

    for (i in 2..ustSinir){
        bolenSayisi = 0
        for (j in 1..i){
             if (i % j == 0) bolenSayisi++
        }

        if (bolenSayisi == 2) println(i)
    }

}