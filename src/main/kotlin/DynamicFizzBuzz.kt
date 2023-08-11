fun main() {
    print("Enter the first number: ")
    var firstNumber = readLine()!!.toInt()

    print("Enter the second number: ")
    var secondNumber = readLine()!!.toInt()

    for (x in firstNumber..secondNumber) {
        if (x % 3 == 0 && x % 5 == 0) {
            println("FizzBuzz")
        } else if (x % 3 == 0) {
            println("Fizz")
        } else if (x % 5 == 0) {
            println("Buzz")
        } else {
            println(x)
        }
    }
}
