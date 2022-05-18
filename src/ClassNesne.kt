/*
class ClassName{
    //property - değişken
    //methods
}
*/

fun main() {
    var lamp = Lamp() //--lamp sınıfından türetilmiş nesne
    lamp.isOn = true
    lamp.turnOn()
    println(lamp.isOn)

    lamp.turnOff()

    println(lamp)
    var lamp2 = Lamp()
    lamp2.isOn = false
}

class Lamp{
    var isOn : Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }
}