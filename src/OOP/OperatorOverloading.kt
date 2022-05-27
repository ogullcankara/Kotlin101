package OOP


fun main() {
    var a : Int = 1
    a++
    var b : Double = 2.5
    b++

    var p = Point(3,-6)
    ++p
    println("p : ${p.x}, ${p.y}")

    val kesir = Kesir(1,3)
    val kesir2 = Kesir(1,4)
    val sonuc = kesir + kesir2
    println(sonuc)

}

class Point(var x : Int = 0, var y : Int = 5){
    operator fun inc() = Point(++x,++y)
}

data class Kesir(val pay : Int, val payda : Int) {
    operator fun plus(eklenenKesir : Kesir) : Kesir =
        if (this.payda == eklenenKesir.payda)
            Kesir(this.pay + eklenenKesir.pay, this.payda)
        else
            Kesir(this.pay * eklenenKesir.payda + eklenenKesir.pay * this.payda,
                this.payda * eklenenKesir.payda)
}