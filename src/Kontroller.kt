fun main() {

    //if else

    var sayi = 10
    if (sayi < 12){
        println("sayi 12 den küçük")
    }else
        println("sayi 12 den büyük")

    var sicaklik = 41

    if (sicaklik < 34){
        println("Sıcaklık 34 den küçük")
    }else if (sicaklik > 34 && sicaklik < 40){
        println("Sıcaklık 34 - 40 arasında")
    }else{
        println("Sıcaklık 40 tan büyük")
    }

    var isLogin = true
    if (isLogin) println("True") else println("False")

    var a = 10
    var b = 20
    var max = if (a > b) a else b
    println(max)

    //when --> switch case

    var sayi1 = 6

    when (sayi1){
        1 -> println("Sayi 1")
        2 -> println("Sayi 2 ")
        else -> println("Bilinmiyor")
    }

    var sayi2 = 1
    var sonuc = when(sayi2){
        0,1 -> "Sıfır veya bir"
        else -> "Bilinmeyen sayi"
    }
    println(sonuc)

    var x = 11
    when(x){
        in 1..10 -> println("1 ile 10 arasında")
        !in 1..10 -> println("1 ile 10 arasında değil")
    }

    //Range -- Aralıklar

    1.rangeTo(10) //1..10
    5.downTo(1) // 5 4 3 2 1

    5 downTo 1 step 2 //5 3 1
}