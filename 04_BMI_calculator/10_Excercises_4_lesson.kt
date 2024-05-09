/**
 * play.kotlinlang.org
 * Selected Excercise 1.
 * Complete the code to make the program print "Mary is 20 years old" to standard output:
 */
fun main() {
    val name = "Mary"
    val age = 20

    print("$name is $age years old")
}

/**
 * play.kotlinlang.org
 * Selected Excercise 2.
 * Explicitly declare the correct type for each variable:
 * fun main() {
 * val a = 1000
 * val b = "log message"
 * val c = 3.14
 * val d = 100_000_000_000_000
 * val e = false
 * val f = '\n'
 * }
 */
fun excercise2() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

/**
 * play.kotlinlang.org
 * Selected Excercise 3.
 * You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
 * fun main() {
 * val greenNumbers = listOf(1, 4, 23)
 * val redNumbers = listOf(17, 2)
 * // Write your code here
 * }
 */
fun excercise3() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount: Int = greenNumbers.count() + redNumbers.count();

    println("Total count: $totalCount")
}

/**
 * play.kotlinlang.org
 * Selected Excercise 4.
 * You have a set of protocols supported by your server.
 * A user requests to use a particular protocol.
 * Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
 * fun main() {
 * val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
 * val requested = "smtp"
 * val isSupported = // Write your code here
 * println("Support for $requested: $isSupported")
 * }
 */
fun excercise4() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported: Boolean = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

/**
 * play.kotlinlang.org
 * Selected Excercise 5.
 * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
 * fun main() {
 * val number2word = // Write your code here
 * val n = 2
 * println("$n is spelt as '${<Write your code here >}'")
 * }
 */
fun excercise5() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}

/**
 * play.kotlinlang.org
 * Selected Excercise 6.
 * Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
 * fun main() {
 * val button = "A"
 * println(
 * // Write your code here
 * )
 * }
 */
fun excercise6() {
    val button = "A"

    println(when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    })
}

/**
 * play.kotlinlang.org
 * Selected Excercise 7.
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices.
 * Refactor this program in two ways:
 * Use a while loop.
 * Use a do-while loop.
 * fun main() {
 * var pizzaSlices = 0
 * // Start refactoring here
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * // End refactoring here
 * println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
 * }
 */
fun excercise7() {
    var pizzaSlices = 0

    while(pizzaSlices < 7){
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")

    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    pizzaSlices = 0
    pizzaSlices++
    do{
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while(pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

/**
 * play.kotlinlang.org
 * Selected Excercise 8.
 * Write a program that simulates the Fizz buzz game.
 * Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz",
 * and any number divisible by five with the word "buzz".
 * Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
 */
fun excercise8() {
    // Write your code here
    for (number in 1..100){
        if (number%3 == 0 && number%5 != 0){
            println("fizz")
        } else if (number%5==0 && number%3 !=0){
            println("buzz")
        } else if (number%5 == 0 && number%3 == 0){
            println("fizzbuzz")
        } else {
            println(number)
        }
    }
}

/**
 * play.kotlinlang.org
 * Selected Excercise 9.
 * You have a list of words. Use for and if to print only the words that start with the letter l.
 * fun main() {
 * val words = listOf("dinosaur", "limousine", "magazine", "language")
 * // Write your code here
 * }
 */
fun excercise9() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words){
        if (word.startsWith("l")){
            println(word)
        }
    }
}

/**
 * play.kotlinlang.org
 * Selected Excercise 10.
 * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
 */
import kotlin.math.PI

fun test() {
    println(circleArea(2))
}
/**
 * @property radius the radius of circle
 * @return circle area based on provided radius
 */
fun circleArea(radius: Int): Double {
    return PI*radius*radius;
}
