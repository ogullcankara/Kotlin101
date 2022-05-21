package OOP


/*
    Soyut sınıftan nesne türetilemez.
    Eğer bir sınıf içerisinde soyut bir metot varsa o sınıfta soyut olamlıdır.
    Soyut sınıfardan soyut alt sınıflar türetilebilir.
    Bu durumda üst sınıfın soyut metodunu override etmek zorunlu değildir.
 */

fun main() {
    val ahmet = Ogretmen1("Ahmet")
    ahmet.isTanimiYaz("Matematik Öğretmeni")
    ahmet.yasGoster(23)
}

abstract class Kisi1 (ad : String){
    init {
        println("Ad : $ad")
    }

    fun yasGoster(yas : Int) {
        println("Yaş : $yas")
    }

    abstract fun isTanimiYaz(isTanimi : String)
}

class Ogretmen1(ad : String) : Kisi1(ad) {
    override fun isTanimiYaz(isTanimi: String){
        println(isTanimi)
    }
}