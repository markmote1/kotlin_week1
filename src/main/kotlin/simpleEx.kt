import java.util.Calendar

fun main(args: Array<String>) {
    println("Enter year of birth")
    var year1:Int = readLine()!!.toInt()
    println("Enter current year")
    var year2:Int = Calendar.getInstance().get(Calendar.YEAR)

    var age = year2 - year1
    print("You are $age years old")
}