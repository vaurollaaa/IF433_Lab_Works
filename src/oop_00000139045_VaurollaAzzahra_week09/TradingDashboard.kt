package oop_00000139045_VaurollaAzzahra_week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, 45.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 5, 8.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, -12.0, "CLOSED"),
        TradeLog("DOGEUSDT", "SHORT", 10, 2.5, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }
}