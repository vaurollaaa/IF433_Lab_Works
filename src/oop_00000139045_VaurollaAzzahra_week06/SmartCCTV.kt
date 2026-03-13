package oop_00000139045_VaurollaAzzahra_week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnon() {
        println("SmartCCTV $name aktif.")
        startRecord()
    }

    override fun turnoff() {
        println("SmartCCTV $name nonaktif.")
    }

    override fun startRecord() {
        println("SmartCCTV $name mulai merekam...")
    }
}