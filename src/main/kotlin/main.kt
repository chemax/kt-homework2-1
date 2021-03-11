package ru.netology

const val comsPercent = 0.0075

fun main() {
    val amount: Long = 600000
    val commission: Long = if ((amount * comsPercent).toLong() > 3500) {
        (amount * comsPercent).toLong()
    } else {
        3500
    }
    println("Комиссия: $commission копеек (${commission / 100f} руб)")
}