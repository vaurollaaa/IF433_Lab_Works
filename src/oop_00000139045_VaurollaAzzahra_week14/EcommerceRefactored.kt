package oop_00000139045_VaurollaAzzahra_week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan blok use untuk safe resource handling
        File("orders.csv").bufferedWriter().use { out ->
            out.appendLine("$itemName, $finalPrice, $customerType")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}