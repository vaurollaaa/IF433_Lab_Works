package oop_00000139045_VaurollaAzzahra_week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() {
        println("SmartLamp $name menyala.")
    }

    override fun turnoff() {
        println("SmartLamp $name mati.")
    }
}