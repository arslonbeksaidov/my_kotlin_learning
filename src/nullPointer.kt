import java.util.StringJoiner
import javax.xml.stream.FactoryConfigurationError

fun main() {
// 1- way
//    if (city != null &&
//        city.address != null &&
//        city.address.street != null &&
//        city.address.street.building != null
//    ) {
//        print(city.address.street.building.name)
//    } else {
//        print(null)
//    }

//    or

//2 - way
//    print(city?.address?.street?.building?.name)

//------------------------------------------------------------

//    city?.address?.street
//    ((if (city == null) null else city.address)?.street)
//---------------------------------------------------------------


//    var name: String? = "Kotlin"
//    val length: Int? = name?.length
//    println(if (length != null) length else 0)

//    or best way

//    println(length ?: 0)

//    -----------------------------------------------------------
//    var name: String? = null
//    val length: Int = name?.length ?: throw Exception("The name is null")
//--------------------------------------------------------------------

//    var name: String? = null
//    val length: Int = name?.length ?: throw Exception("The name is null")
//    println(length)
//    ---------------------------------------------------------------------
//    println("What is your nickname?")
//    val nickname = readlnOrNull()
//    println("Hello, $nickname!")
//    ----------------------------------------------------------------
//    val nullString: String? = null
//    println(nullString?.length ?: -1)   // -1
//    val emptyString: String? = ""
//    println(emptyString?.length ?: -1)  // 0
//    ------------------------------------------------------------------------


//    readlnOrNull() ?: error("No lines read")

//-------------------------------------------------------------------
//    val b:Boolean? = null
//    if (b == true){
//        println("true")
//    }else{
//        println("false or null")
//    }
// --------------------------------------------------------------------------

//    val nullString:String? = null
//    println(nullString?.isNotEmpty()?:false)

//    val nullString: String? = null
//    print(nullString?.isNotEmpty() == true) // false
//-------------------------------------------------------


//        var name: String? = null
//    print(name!!.length)
//    -------------------------------------------------

//    val line: String = readLine() ?: throw IllegalStateException()
//    println("Elvis says: $line")

//    fun logCurrentState(): Unit {
//        println("Current state of a program: $state")
//    }
//
//    fun updateState(state: State) {
//        logCurrentState()
//        this.state = state
//        logCurrentState()
//    }
//
//    val result: Unit = logCurrentState()
//    ---------------------------------------------------------------

//    fun throwIfNull(name: String?) {
//        if (name == null){
//            throw Exception("Name can't be null!")
//        }
//    }

//    ---------------------------------------------------------------
//fun isNumber(input: String): Any {
//    return try {
//        input.toInt()
//    } catch (e: NumberFormatException) {
//        input
//    }
//}
}
