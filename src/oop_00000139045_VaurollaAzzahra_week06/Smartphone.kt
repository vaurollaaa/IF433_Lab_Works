package oop_00000139045_VaurollaAzzahra_week06

// ERROR: Class Smartphone inherits multiple implementations of turnon()
class Smartphone: Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnon() {
        super<Camera>.turnon() // Menjalankan logika Camera
        super<Phone>.turnon() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}