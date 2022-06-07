fun main() {
    fun stringfy(any: Any) {
        println(any?.toString())
        println(any!!.toString())
    }
    stringfy("dd")
//    val number1: Number = null // Error: Null can not be a value of a non-null type Number

//    val number2: Number? = null // OK
}