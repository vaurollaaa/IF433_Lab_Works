package oop_00000139045_VaurollaAzzahra.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk() //Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di-override
    myCar.accelerate()// Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 100)

    myEV.openTrunk()    // Mewarisi dari Car
    myEV.honk()         // Mewarisi dari Car
    myEV.accelerate()   // Memanggil final override milik ElectricCar
}