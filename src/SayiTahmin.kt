import java.util.*

fun main(args: Array<String>) {
//Sayı tahmin

   /* for(i in 1..5){
        var rastgele = Random()
        var sayi = rastgele.nextInt(5) +1
        println(sayi)
    }
    */

    var rastgele = Random()
    var sayi = rastgele.nextInt(20) + 1
    var tahmin : Int
    var sayac = 1

    while (true){
        println("Tahmininiz : ")
        tahmin = readLine()!!.toInt()

        if (tahmin > sayi){
            println("Sayıyı küçültün ")
            sayac++
        }else if (tahmin < sayi){
            println("Sayıyı büyültün ")
            sayac++
        }else if (tahmin == sayi){
            println("Tebrikler $sayac seferde doğru bildiniz")
            break
        }
    }

}