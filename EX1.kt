package TP12

fun findMax(numbers: List<Int>, compare: (Int, Int) -> Int): Int {
    var max = numbers[0]
    for (n in numbers) {
        max = compare(max, n)
    }
    return max
}

fun main() {
    val list = listOf(4, 17, 9, 25, 3)
    val result = findMax(list) { a, b -> if (a > b) a else b }
    println("Max = $result")
}