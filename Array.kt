package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    val namaMakanan : Array<String> = arrayOf(
        "1. Sate Ayam",
        "2. Nasi Padang",
        "3. Ayam Goreng",
        "4. Mie Ayam",
        "5. Mie Goreng",
        "6. Mie Rebus",
        "7. Nasi Uduk",
        "8. Nasi Kuning",
        "9. Nasi Kebuli",
        "10. Tempe",
        "11. Tahu",
        "12. Nasi Tumpeng",
        "13. Perkedel",
        "14. Kentang",
        "15. Kebab",
        "16. Burger",
        "17. Steak",
        "18. Ayam Bakar",
        "19. Ayam Geprek",
        "20. Kwetiau"
    )
    namaMakanan.forEachIndexed { index, makanan ->
        println("$makanan")
    }
}