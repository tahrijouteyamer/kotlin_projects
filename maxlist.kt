fun main() {
    val numbers = listOf(3, 7, 2, 9, 4)
    println("Max value: ${findMax(numbers)}")
}

fun findMax(numbers: List<Int>): Int {
    return numbers.maxOrNull() ?: throw IllegalArgumentException("List is empty")
}
