package oop_00000139045_VaurollaAzzahra_week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // Menambahkan fungsi pencarian sederhana dengan constraint <T: Any>
    fun <T : Any> findItem(list: List<T>, predicate: (T) -> Boolean): T? {
        return list.find(predicate)
    }
}