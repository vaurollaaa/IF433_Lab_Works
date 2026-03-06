package oop_00000139045_VaurollaAzzahra_week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}