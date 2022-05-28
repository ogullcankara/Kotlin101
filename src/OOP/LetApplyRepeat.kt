package OOP

fun main() {
    var str: String? = "test"
    if (str != null) {
        println("null değil")
    }else  {
        println("null")
    }

    str?.let {
        println("null değil")
    } ?: println("null")

    val result = str?.let {
        println(it)
        12
    }
    println(result)

    val task = Runnable { println("running") }
    val thread = Thread(task)

    var dev = Dev()
    dev.age = 22
    dev.name = "test"
    dev.write()

    dev.apply {
        age = 23
        name = "Ogulcan"
        write()
    }

    repeat(12,{ println("test")})

}

class Dev {
    var name: String?= null
    var age: Int?= null

    fun write() = println("writing")
}