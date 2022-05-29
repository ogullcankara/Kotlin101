package OOP

fun main() {

    var person = Person5()

    with(person) {
        name = "Ogulcan"
        age = 43
        eat()
    }
    person.apply {
        name = "test"
        age = 45
        run()
    }

    var adress = Adress("new street", 2345)
    val user = Userx("Ali", adress)

    val result = user.also { it.age = 12}

    var personx = Person5()
    var x = personx.takeIf { it is Person5 } ?: "not a person"
    println(x)

    var y = personx.takeUnless { it is Person5 }
    println(y)
}

data class Adress(var street: String? = null, var code: Int? = null)
data class Userx(var name: String? = null, var adress: Adress? = null, var age: Int? = null)

class Person5 {
    var name: String?= null
    var age: Int = 0

    fun run() = println("run")
    fun eat() = println("eat")

}