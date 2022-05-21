package OOP

fun main() {

    var girl = Girl()
    girl.displayAge(23)

    var girl2 = Girl()
    girl2.name = null
    println(girl2.name)

}

open class Person2() {
    open fun displayAge(age : Int) {
        println("Age : $age")
    }

    open var name : String? = null
    get() = field
    set(value) {
        field = value
    }
}

class Girl : Person2() {
    override fun displayAge(age: Int) {
        println("Age : ${age - 5}")

        super.displayAge(age)
    }

    override var name: String? = null
        get() = field
        set(value) {
            field = if (value == null) "No Name" else value
        }
}