fun main(args: Array<String>) {
    println("Enter your Age")

    var myage:Int = readln()!!.toInt()

    if (myage >= 18) {
        println("Welcome to the club")
    }
    else{

        print("Sorry cannot admit an underage")
    }
}