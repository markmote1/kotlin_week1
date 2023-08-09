fun main(args: Array<String>) {
    println("Enter your marks")
    var marks: Int = readLine()!!.toInt()

    if (marks in 10..29) {
        print("E")
    } else if (marks in 30..39) {
        print("D")
    } else if (marks in 40..59) {
        print("B")
    } else if (marks in 60..69) {
        print("B+")
    } else if (marks in 70..100) {
        print("A")
    } else {
        print("Sorry! Do a resit")
    }
}
