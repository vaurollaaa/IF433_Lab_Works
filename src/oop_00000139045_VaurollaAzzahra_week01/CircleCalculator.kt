package oop_00000139045_VaurollaAzzahra_week01

package oop_001.johnthor.week01

fun main(args: Array<String>) {

    // Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    // Calculation
    var area: Double = pi * radius * radius

    // Output Concatenation
    println("Radius: " + radius + ", Area: " + area)

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
