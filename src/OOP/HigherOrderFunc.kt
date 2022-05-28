package OOP

fun main() {
    callMe {
        println("Hello")
    }

    sayHello("Ogulcan",{
        name -> println(name)
    })

    foo("kotlin", {
        it.reversed()
    })

    add(3,4, {
        println(it)
    })

    fooBar {
        fun1()
        prop
    }
}

fun callMe(func: () -> Unit){
    func()
}

fun sayHello(name: String, body: (String) -> Unit){
    body("Hello $name")
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a+ b)
}

fun foo(str: String, func: (String) -> String) {
    var x = func(str)
    println(x)
}

class Bar {
    var prop : String? = null
    fun fun1() = println("fun 1")
    fun fun2() = println("fun 2")
    fun fun3() = println("fun 3")
}

fun fooBar(block: Bar.() -> Unit) {
    var bar = Bar()
    bar.block()

}