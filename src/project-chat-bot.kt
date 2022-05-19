import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)


    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.next()
    // reading.txt a name

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    val countIn = readLine()!!.toInt()
    for (i in 0..countIn) {
        println("$i!")
    }
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    fun qustionChecker() {
        println("Please, try again.")
    }
    while (true) {
        when(readLine()!!.toInt()){
            1->{qustionChecker()}
            2->{
                println("Congratulations, have a nice day!")
                return
            }
            3->{qustionChecker()}
            4->{qustionChecker()}
        }
    }

}

