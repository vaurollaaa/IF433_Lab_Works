package oop_00000139045_VaurollaAzzahra_week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun main () {

    val gameTitle: String = "Roblox"
    val price: Int = 100

    val finalPrice = calculateDiscount(price)

}
