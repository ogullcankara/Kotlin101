package OOP


fun main() {
    var a : Int = 1
    a++
    var b : Double = 2.5
    b++

    var p = Point(3,-6)
    ++p
    println("p : ${p.x}, ${p.y}")

}

class Point(var x : Int = 0, var y : Int = 5){
    operator fun inc() = Point(++x,++y)
}