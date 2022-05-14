fun main() {
    //For

    for (i in 1..5) println("Kotlin")
    for (i in 1..5) println(i)
    for (i in 5 downTo 1) println(i)
    for (i in 1..10 step 2) println(i)
    for (i in 12 downTo 1 step 3) println(i)

    //ForEach
    //(aralık).forEach{döngü değişkeni -> //çalışacak kod}

    (0..10).forEach{i -> println(i)}
    (10 downTo 1 step 2).forEach { i -> println(i) }

    //while
    //while(koşul){çalışacak kodlar}

    var i = 1
    while (i <= 10){
        println(i)
        i++
    }
    println("--------------")
    var sayi = 0
    while (sayi <= 10){
        println(sayi)
        sayi += 2
    }

    println("--------------")
    var sayi1 = 0
    var toplam = 0
    while (sayi1 <= 10){
        if (sayi1%2 == 1){
            toplam = toplam +sayi1
        }
        sayi1++
    }
    println("Tek sayıların toplamı : $toplam")

    //do while
    /*do {çalışacak kod
     }while(şart)
     */

    var x = 1
    do {
        println(x)
        x++
    }while (x < 11)

    println("--------------")

    while (x < 12){
        println(x)
        x++
    }

    //Break


}