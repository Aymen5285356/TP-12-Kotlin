package TP12

fun convertToIntList(strings: List<String>): List<Int> {
    val result = mutableListOf<Int>()
    for (s in strings) {
        try {
            result.add(s.toInt())
        } catch (e: NumberFormatException) {
            println("Error: '$s' cannot be converted to an integer")
        }
    }
    return result
}

fun main() {
    val strings = listOf("10", "abc", "25", "3.5", "42")
    val numbers = convertToIntList(strings)
    println("Converted list: $numbers")
}