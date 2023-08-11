fun main(args: Array<String>) {


    println("Enter number to indicate floor")

    var floor = readLine()!!.toInt()
    when(floor){

        1-> print("Go to First Floor")
        2-> print("Go to Second Floor")
        3-> print("Go to Third Floor")
        4-> print("Go to Fourth Floor")

        else -> print("No more Floors")

    }
}