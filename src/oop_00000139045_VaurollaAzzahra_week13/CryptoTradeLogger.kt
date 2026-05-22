package oop_00000139045_VaurollaAzzahra_week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
    val parts = line.split(",")
    return TradeRecord(
        id = parts[0].toInt(),
        symbol = parts[1],
        type = parts[2],
        margin = parts[3].toDouble(),
        pnl = parts[4].toDouble()
    )
} catch (e: Exception) {
    println("(Log) Data korup diabaikan: $line")
    null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach { trade ->
            out.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan.")
        emptyList()
    }
}

fun main() {
    val simulatedTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 100.0, 25.5),
        TradeRecord(2, "ETHUSDT", "Short", 50.0, -10.0)
    )

    saveTrades(simulatedTrades, "crypto_trades.csv")
}


