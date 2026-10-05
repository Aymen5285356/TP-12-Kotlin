package TP12

fun main() {
    val isPositive = fun(n: Int): Boolean {
        return n > 0
    }

    val numbers = listOf(5, -3, 0, 12, -8)
    for (n in numbers) {
        if (isPositive(n)) {
            println("$n is positive")
        } else {
            println("$n is negative")
        }
    }
}