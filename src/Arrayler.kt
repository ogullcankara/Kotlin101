fun main() {
    val myExampleArray = arrayOf(1,2,3,4,5,6)
    println("Element 1: ${myExampleArray[1]}")

    val myArray = arrayOf("Ali","Ahmet","Murat","Fatma")
    println(myArray[3])

    val numberArray = arrayOf(1,2,3,4,5,6)
    println(numberArray[3])
    val doubleArray = doubleArrayOf(1.2,2.4,3.7,4.9)
    println(doubleArray[3])
    val mixedArray = arrayOf("Ogulcan",5,7.8)
    println(mixedArray[0])
    println(mixedArray[1])
    println(mixedArray[2])

    //---------List---------
    val musicianArraylist = arrayListOf<String>("Mahzar","Fuat","Özkan")
    println(musicianArraylist[2])
    musicianArraylist.add("Test")
    println(musicianArraylist[3])
    musicianArraylist.add(0,"test")
    println(musicianArraylist[0])

    val mixedArrayListExp = ArrayList<Any>()
    mixedArrayListExp.add("Ogulcan")
    mixedArrayListExp.add(0,"test")
    mixedArrayListExp.add(5.7)
    mixedArrayListExp.add(true)

    println(mixedArrayListExp[0])
    println(mixedArrayListExp[3])

}