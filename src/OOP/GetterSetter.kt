package OOP

fun main() {
    var person1 = Person1()
    person1.name = "Ogulcan" // yazma
    var isim = person1.name // okuma

    var user1 = User1()
    user1.age = 15
    user1.actualAge = 15

    println("user1 actual age : ${user1.actualAge}")
    println("user1 actual age : ${user1.age}")

    var user2 = User1()
    user2.age = 34
    user2.actualAge = 34

    println("user2 actual age : ${user2.actualAge}")
    println("user2 actual age : ${user2.age}")

}

class Person1 {
    var name : String = "TEST"
    get() = field
    set(value) {
        field=value
    }
}

class User1 {
    var age : Int = 0
    get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value >= 18 && value <= 30)
            value
        else
            value -1
    }
    var actualAge : Int = 0
}