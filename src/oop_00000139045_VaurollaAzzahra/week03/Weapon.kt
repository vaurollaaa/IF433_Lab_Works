package oop_00000139045_VaurollaAzzahra.week03

class Weapon(val name: String, damageInput: Int) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh di-set negatif!")
            } else if (value > 1000) {
                println("Damage terlalu besar! Di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    init {
        damage = damageInput   // lewat setter → otomatis tervalidasi
    }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}