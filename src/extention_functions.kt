fun main() {
    fun String.reapeated() = this + this
    fun Int.multiply() = this * this
//    println("Arslon".reapeated())
//    println(3.multiply())

    class Client(val name: String, val age: Int) {
    }

    fun Client.getInfo(number: Int) = "$name $age $number"
    val client = Client("John", 32)

    //    print(client.getInfo(number = 3)) // client is the receiver object
    fun Client.mix():String {
        println("dddd")
        return "$name $age"
    }
    println(Client(age = 4, name = "44").mix())

   fun Int.lastDigit(): Int = (Math.abs(this) % 10);
//    -------------------------------------------------------
fun Double.addInt(i: Int) = println(this + i.toDouble())

    val result = 5.5.addInt(10)
    println(result)
}