import kotlin.random.Random

fun main(){
//    val numberOnTheDice = Random.nextInt(1,6)
//    println(numberOnTheDice)


    fun generatePredictablePassword(seed: Int): String {
        val randomGenerator42 = Random(seed)
        var randomPassword = ""
        for (i in 1..10) {
           randomPassword+= randomGenerator42.nextInt(33,127).toChar()
        }
        // write your code here
        return randomPassword
    }
    println(generatePredictablePassword(10))

}