fun main() {
    helloWorld()
    helloWorld2()
    mesajYaz("Selam")

    var mesaj = getMessage()
    println(mesaj)

    var mesaj2 = getMessage2()
    println(mesaj2)

    var nameSurname = getName("Ogulcan","Kara")
    println(nameSurname)
}

//Parametresiz Fonksiyon
fun helloWorld(){
    println("Hello World")
}
fun helloWorld2() = println("Hello world 2")

//parametreli Fonksiyon
fun mesajYaz(mesaj : String){
    println("Mesajınız : $mesaj")
}

//Dönüş değeri olan fonkiyon
fun getMessage(): String{
    return "Dönüş"
}

fun getMessage2() : String = "Dönüş 2"

//Parametreli ve dönüş Değerli Fonksiyon
fun getName(name: String, surName: String) : String = "Adınız : $name Soyadınız : $surName"
