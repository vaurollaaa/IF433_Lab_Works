package oop_00000139045_VaurollaAzzahra_week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) { usedAmount += amount; println("Sukses") }
        else { println("Transaksi ditolak") }
    }
}