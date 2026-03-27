package oop_00000139045_VaurollaAzzahra_week07

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}