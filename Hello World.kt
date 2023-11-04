package remed

fun main() {
    //print
    //  "Saya lapar sekali, minjem 100 dong buat makan hari ini" 600 kali
    // GUNAKAN RANGE
  val ntah = 1..600
    var print = 0
    ntah.forEachIndexed { index, angka ->
        println("Saya lapar sekali, minjem 100 dong buat makan hari ini")
    }
}
