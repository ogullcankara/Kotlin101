package OOP

fun main() {

    var myInterface = InterfaceImp()
    println("Prop : ${myInterface.prop}")
    myInterface.foo()
    myInterface.hello()

    val z = Z()
    z.hello()
    z.funcT()
}

interface MyInterface {
    var prop : String
    fun foo()
    fun hello() = "Hello"
}

interface Abc {
    fun funcAbc()
}

class InterfaceImp : MyInterface, Abc {
    override var prop: String = "Kotlin"

    override fun foo() {
    }

    override fun funcAbc() {
    }
}

interface X {
    fun hello() = println("Hello from X")
}

interface Y : T {
    fun hello() = println("Hello from Y")
}

interface T {
    fun funcT()
}

interface  Q {
    interface W {
        fun funcW()
    }
}

class Z : X, Y, Q.W {
    override fun hello() {
        super<X>.hello()
        //super<Y>.hello()
    }

    override fun funcT() {

    }

    override fun funcW() {

    }
}