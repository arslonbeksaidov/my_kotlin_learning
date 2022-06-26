fun main() {
//var staff = mapOf<String,Int>(
//    "John" to 500,
//    "Mike" to 400
//)
//    staff += "Jane" to 900

    val staff = mutableMapOf<String, Int>(
        "john" to 500,
        "mike" to 300
    )
    staff["Nika"] = 900
//    print(staff)

//    print(staff.containsKey("john"))
//    print(staff.containsValue(300))
//    val groupOfStudents = mutableMapOf<String, Int>() // empty mutable map
//    groupOfStudents.put("John", 4)
//    groupOfStudents["Mike"] = 5
//    groupOfStudents["Anastasia"] = 10
//
//    val studentsFromOregon = mapOf("Alexa" to 7)
//
//    groupOfStudents.putAll(studentsFromOregon)
//
//    println(groupOfStudents) // output: {John=4, Mike=5, Anastasia=10, Alexa=7}

//    ----------------------------------
//    val groceries = mutableMapOf<String, Int>()
//
//    groceries += mapOf("Potato" to 5)
//    groceries += "Sprite" to 1
//
//    println(groceries)  // output: {Potato=5, Sprite=1}

//------------------------remove
//    val groceries = mutableMapOf(
//        "Potato" to 10,
//        "Coke" to 5,
//        "Chips" to 7
//    )
//    groceries.remove("Coke")
//    println(groceries)
//    groceries.clear()
//    println(groceries)
//    --------------------------remove second version
//    val cars = mutableMapOf<String, Double>()
//    cars["Ford"] = 100.500
//    cars["Kia"] = 500.15
//
//    println(cars)  // output: {Ford=100.5, Kia=500.15}
//
//    cars -= "Kia"
//    println(cars)  // output: {Ford=100.5}


//    fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
//        val ans = purchases.toMutableMap()
//        for ((key, value) in purchases) {
//            for ((key_i, value_id) in addition) {
//                if (key == key_i) {
//                    ans.put(key, value + value_id)
//                } else {
//                    ans[key_i] = addition.getOrElse(key_i) { 0 }
//                }
//            }
//        }
//        return ans
//
//    }
//    println(
//        helpingTheRobot(
//            purchases = mapOf("bread" to 1, "potatoes" to 7, "milk" to 2),
//            addition = mapOf(
//                "milk" to 1,
//                "water" to 3
//            )
//        )
//    )

//fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
//    val new = purchases.toMutableMap()
//
//    for ((k, V) in addition) {
//        if (new.containsKey(k)) {
//            new[k] = purchases[k]!! + addition[k]!!
//        } else new.put(k, V)
//    }
//    return new
//}

//    fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
//        // write your code here
//        return userMap.toMutableMap().also {
//            if (it.keys.contains(login)) {
//                println("User with this login is already registered!")
//            } else {
//                it[login] = password
//            }
//        }
//    }


    fun somefun() {
        val studentsMarks = mutableMapOf<String, Int>()
        while (true) {
            when (val name = readln()) {
                "stop" -> break
                else -> studentsMarks.putIfAbsent(name, readln().toInt())
            }
        }
        println(studentsMarks)
    }


}