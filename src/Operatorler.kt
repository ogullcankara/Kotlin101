fun main() {

    //Atama operatorleri
    var x = 5
    println(x)
    var y = 10
    println(x)
    x = y
    println(x)
    println(y)

    //Aritmetik operatorler
    println(5*4)
    println(10%3)
    var s1 = 5
    s1++
    println(s1)
    s1--
    println(s1)
    s1+=3
    println(s1)

    //İlişkisel operatorler
    // < > <= >= == !=
    var a : Int = 5
    var b : Int = 6
    println(a > b)
    println(a <= b)
    println(a == b)
    println(a != b)

    //Mantıksal operatorler
    // && ||

    var q = true
    var w = false
    println(q && w)  //koşullu ve
    println(q || w)  //koşullu veya

    //Birleştirme operatorleri

    var  firstLang = "Kotlin"
    var secondLang = "Java"

    println("""$firstLang$secondLang""")
    println("$firstLang dili")
    println("${firstLang.length} uzunluğu")



}