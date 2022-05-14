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
    for (i in 1..5){
        if(i == 5){
            break
        }
        println(i)
    }

    var sayi3 : Int
    var toplam1 = 0
    while (true){
        println("Sayı gir : ")
        sayi3 = readLine()!!.toInt()

        if(sayi3 == 0) break

        toplam1 += sayi3
    }

    println("Toplam = $toplam1")

    //Continue

    for (i in 1..5){
        println("$i atla")
        if (i > 1 && i < 5) continue
        println("$i devam")
    }

    var sayi4 : Int
    var toplam4 = 0

    for (i in 1..5){
        println("Sayı gir : ")
        sayi4 = readLine()!!.toInt()

        if(sayi4 <= 0) continue

        toplam4 += sayi4
    }

    println("Toplam : $toplam4")

    //Tagged Break ve Continue

    disdongu@for (i in 1..3){
         icdongu@for (j in 1..5){
             println("i = $i: j = $j")

             if(i == 2)break@disdongu
         }
    }

    println("---------------")

    for (i in 1..4){
        for(j in 1..5){
            if (i == 2) continue
            println("i = $i; j = $j")
        }
    }



}