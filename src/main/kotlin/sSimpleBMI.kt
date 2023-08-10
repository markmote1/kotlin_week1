fun main(args: Array<String>) {
    println("Enter weight in Kg")
    var weight:Double = readLine()!!.toDouble()
    println("Enter height in metres")
    var height:Double = readLine()!!.toDouble()

    var result = weight / (height * height)

    if (result <= 18.4) {
        print("Underweight")
    } else if (result in 18.5..24.9) {
        print("Normal Weight")
    } else if (result in 25.0..39.9) {
        print("Overweight")
    } else if (result >= 40.0) {
        print("Obese")

    } else {
        print("Error")
    }
}