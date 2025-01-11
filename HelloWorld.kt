fun main() {
    // Print a welcome message
    println("Welcome to Kotlin Programming!")
    
    // Variables in Kotlin
    val name = "John"
    var age = 25
    println("Name: $name, Age: $age")

    // Updating the mutable variable
    age += 1
    println("Next year, $name will be $age years old.")

    // Functions
    println("Sum of 3 and 5 is: ${sum(3, 5)}")

    // Using a class
    val person = Person("Alice", 30)
    person.introduce()
}

// Function to add two numbers
fun sum(a: Int, b: Int): Int {
    return a + b
}

// A simple class in Kotlin
class Person(val name: String, private val age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}
