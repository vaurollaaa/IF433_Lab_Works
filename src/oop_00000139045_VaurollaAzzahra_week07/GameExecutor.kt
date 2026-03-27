package oop_00000139045_VaurollaAzzahra_week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Ada monster: ${event.monsterName}")
        is LootDropped -> {
            val (name, _, rarity) = event.item // Destructure
            println("YAYYY! Mendapat loot: $name dengan rarity $rarity")
        }
        is GameOver -> println("Permainan Berakhir: ${event.reason}")
        is SafeZone -> println("Kamu berada di area aman. Silakan beristirahat.")
    }
}