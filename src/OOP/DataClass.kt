package OOP

fun main() {
    val person = Person3("Ogulcan",23)
    println("name : ${person.name}, age : ${person.age}")

    person.component1()
    person.component2()
    println("name : ${person.component1()}, age : ${person.component2()}")

    val person2 = person.copy("Emir")
    println("name : ${person2.name}, age : ${person2.age}")

    println(person.toString())
    println(person2.toString())

    val person3 = person2.copy()

    println("person hashcode : ${person.hashCode()}")
    println("person hashcode : ${person2.hashCode()}")
    println("person hashcode : ${person3.hashCode()}")


    if (person.equals(person2)) println("person eşittir person 2")
    else println("person eşit değil person 2")

    if (person2.equals(person2)) println("person 2 eşittir person 3")
    else println("person 2 eşit değil person 3")


}

data class Person3 (var name: String, var age : Int)