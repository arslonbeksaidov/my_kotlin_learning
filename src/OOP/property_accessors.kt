package OOP

class Client {
    var name = "Unknown"
        get() {
            println("Somebody wants to know $field name")
            return field
        }
    var age: Int = 18
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val defaultAge = 18
    var info: String = ""
        get() {
            return "name = $name, age = $age"
        }
        set(value) {
            println("old value is $field and new one is $value")
            field = value
        }
}
val client = Client()
//------------------------------------------------------------------------------------
//class Client2(name: String, age: Int) {
//    var fullName: String = name
//        set(value) {
//            println("The name is changing. Old value is $field. New value is $value.")
//            field = value
//        }
//    var age: Int = age   // this is a new property, not a property from the constructor
//        set(value) {
//            println("The age is changing. Old value is $field. New value is $value.")
//            field = value
//        }
//}
//-----------------------------------------------------------------------------------
class Passport(number: String) {
    var number = number
        set(value) {
            println("Passport number has changed.")
            field = value
        }
}

class Client3 {
    val passport = Passport("1234567")
}

fun main(){
//    client.name = "Arslon"
//    client.age = -25
//    client.info = "dfdfdfdf"
//    println(client.info)
//    -------------------------------------------------
//    va`l cliend2 = Client2(name = "Arslonbek", age = 26)
//    cliend2.age = 27
//    println(cliend2.age)`
//    -------------------------------------------------
val client = Client3()
    println(client.passport.number)
    client.passport.number = "34565432345"
    println(client.passport.number)
    client.passport.number = "55555555"
    println(client.passport.number)
}