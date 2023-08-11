fun main(args: Array<String>) {

    println("Enter option")

    var option = readLine()!!.toInt()
    when(option){
        0-> print("Sh20=1GB for 1hr")
        1-> print("Data Deals")
        2-> print("Daily bundles")
        3-> print("Weekly Bundles")
        4-> print("Go Monthly")
        5-> print("No Expiry")
        6-> print("Video Bundles")

        else -> print("Invalid Option")

    }
}