package oop_00000139045_VaurollaAzzahra_week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------------")

        val math = MathHelper()

        println("Luas Persegi: ${math.hitungLuas(5)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(5, 10)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

        val eWallet = EWallet("Vaurolla", 50000.0)
        val creditCard = CreditCard("Olllaaaaaaaa", 100000.0)

        val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

        println("\n=== SISTEM PEMBAYARAN ===")
        for (pembayaran in daftarPembayaran) {
            pembayaran.processPayment(75000.0)
        }
    }
}