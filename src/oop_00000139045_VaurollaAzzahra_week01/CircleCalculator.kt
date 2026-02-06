package oop_00000139045_VaurollaAzzahra_week01

package oop_001.johnthor.week01

fun main(args: Array<String>) {

    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")

    val grade = when (score) {
        in 90 ..100 -> "A"
        in 80 ..89 -> "B"
        in 70 ..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
