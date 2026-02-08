package oop_00000139045_VaurollaAzzahra_week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int){
    println("===== STRUK PEMBELIAN GAME =====")
    println("Judul Game: $title")
    println("Total Harga: $finalPrice")
}

fun main () {

    val gameTitle: String = "Roblox"
    val price: Int = 100

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}
