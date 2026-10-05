package TP12

fun readNumber(): Int {
    while (true) {
        print("Enter an integer: ")
        val input = readln()
        try {
            val number = input.toInt()
            println("You entered: $number")
            return number
        } catch (e: NumberFormatException) {
            println("Error: '$input' is not a valid integer. Try again.")
        }
    }
}

fun main() {
    readNumber()
}