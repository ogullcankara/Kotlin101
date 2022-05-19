package OOP

fun main() {

    var p = Person("TEST",23)
    var p2 = Person("TEST2")
    var p3 = Person(age = 12)
    p.age = 21
    var yas = p.age

    var user = User("ogulcan",25)
}

class Person(var name : String? = null, var age : Int? = null){ //değikenlerle birlikte parametre olarak constructor tanımlama

}


class User(firstName : String, userAge : Int){
    var name : String? = null
    var age : Int? = null

    init {
        name = firstName.capitalize()
        age = userAge

        println("First Name : $name")
        println("Age : $age")
    }
}
/*
class Person(name1: String, age1: Int) { //parametre olarak constructor tanımlama

    var name : String? = name1
    var age : Int? = age1

    /* constructor tanımlama
    constructor(name1 : String, age1 : Int) {
        this.name = name1
        this.age = age1
     */

}
*/
