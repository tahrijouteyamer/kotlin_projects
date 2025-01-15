fun main() {
    println("Please enter a phrase:")
    val input = readLine() ?: "" 
    val letterCount = input.count { it.isLetter() }
    val wordCount = input.split(" ").filter { it.isNotBlank() }.size

    println("The phrase contains:")
    println("- $letterCount letters")
    println("- $wordCount words")
}
