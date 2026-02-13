package oop_00000139045_VaurollaAzzahra_week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    // Validasi di sisi pemanggil (main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        //Program berhenti disini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. Reguler,  2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        //Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else {
        println("Pilihan Ngawur, pendaftaran batal!")
    }

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (hari): ")
    var days = scanner.nextInt()
    if (days < 0) days = 1
    scanner.nextLine()

    val loan = Loan(title, borrower, days)
    println("Denda: Rp ${loan.calculateFine()}")


    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Damage Hero: ")
    val dmg = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, dmg)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Serang  2. Kabur")
        val choice = scanner.nextInt()

        if (choice == 1) {
            enemyHp -= hero.baseDamage
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDmg = (10..20).random()
                hero.takeDamage(enemyDmg)
                println("Hero kena $enemyDmg, HP: ${hero.hp}")
            }
        } else {
            println("Hero kabur!")
            break
        }
    }

    if (hero.hp > 0 && enemyHp <= 0) println("Hero menang!")
    else println("Hero kalah!")


}