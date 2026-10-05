package TP12

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val x = 20
    val y = 5
    println("Addition: ${calculate(x, y, fun(a: Int, b: Int): Int { return a + b })}")
    println("Subtraction: ${calculate(x, y, fun(a: Int, b: Int): Int { return a - b })}")
    println("Multiplication: ${calculate(x, y, fun(a: Int, b: Int): Int { return a * b })}")
    println("Division: ${calculate(x, y, fun(a: Int, b: Int): Int { return a / b })}")
}
