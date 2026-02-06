package oop_00000139045_VaurollaAzzahra_week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name: String = "John Thor"
    val score: Int = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name , Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade: $grade")

    println ("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    //Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}