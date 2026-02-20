package oop_00000139045_VaurollaAzzahra.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")

    val sword = Weapon("Pedang Kayu", 100)

    sword.damage = -50
    sword.damage = 9999

    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

}
