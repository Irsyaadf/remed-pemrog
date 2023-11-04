package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    //Diketahui barisan aritmatika sebagai berikut 3, 7, 11, 15,19
    //Tentukan nilai suku ke -10
    val range = 3..39 step 4
    var jumlahSemuaSuku = 0
    range.forEachIndexed { index, angka ->
        println("Suku ${index + 1} adalah $angka")
    }
}
