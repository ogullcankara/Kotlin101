package OOP

fun main() {

}


class PublicClass {
    val  i = 3
    fun func (){
        println(i)
    }
}

class PrivateClass{
    private val x = 1
    private fun funcPrivate(){
        println(x)
    }
}

open class A {
    protected val a = 2
}

class B : A() {
    fun getMethod() = a
}

class C : A(){
    fun getValue() {
        val x = a
    }
}
