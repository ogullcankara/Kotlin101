package OOP

fun main() {
    guneGoreHesapla(Gunler.CUMA,12)

    println(Renk.KIRMIZI)
    println(Renk.KIRMIZI.rgb)
}

fun guneGoreHesapla(gun : Gunler,deger: Int) : Int =
    when(gun){
        Gunler.PAZARTESI-> deger + 6
        Gunler.SALI-> deger *6
        Gunler.CARSAMBA-> deger - 6
        Gunler.PERSEMBE-> deger + 1
        Gunler.CUMA-> deger + 2
        Gunler.CUMARTESI-> deger - 3
        Gunler.PAZAR-> deger + 9
        else -> -1

    }

enum class Gunler {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
}

enum class Renk(val rgb : Int) {
    KIRMIZI(0xFF0000),
    YESIL(0x00FF00),
    MAVI(0x0000FF)
}