package OOP

fun main() {
    var result = ObjectExp.multiple(2,3)
    println(result)
    ObjectExp.a
    ObjectExp.b
    println(Math.min(8,1))

    val person = object : Person4() {
        override fun write() {
            println("Dont write")
        }
    }

    person.eat()
    person.write()

    println(person.javaClass)

    val person2 = Person4()
    println(person2.javaClass)

    println("---------------")

    val user = User2()
    user.name
    user.func()

    println(User2.age)
    User2.call()


}

object ObjectExp {
    var a : Int = 0
    var b : Int = 1

    fun multiple(x : Int, y : Int) : Int = x * y
}

open class Person4() {
    fun eat() = println("Eating")
    fun talk() = println("Talking")
    open fun write() = print("Writing")

}

class User2 {
    var name : String? = null
    fun func() = println("Func")

    companion object {
        var age : Int = 23
        fun call() = println("Call")
    }

}
