package TP12

fun countElements(numbers: List<Int>, condition: (Int) -> Boolean): Int {
    var count = 0
    for (n in numbers) {
        if (condition(n)) {
            count++
        }
    }
    return count
}

fun main() {
    val list = listOf(3, 8, 12, 15, 20, 7, 10)
    val evenCount = countElements(list) { it % 2 == 0 }
    val greaterThan10 = countElements(list) { it > 10 }
    println("Even numbers: $evenCount")
    println("Numbers greater than 10: $greaterThan10")
}