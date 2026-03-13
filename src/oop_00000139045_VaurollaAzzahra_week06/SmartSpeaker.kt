package oop_00000139045_VaurollaAzzahra_week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() {
        println("SmartSpeaker $name aktif.")
    }

    override fun turnoff() {
        println("SmartSpeaker $name nonaktif.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}