fun main() {
    val students = mapOf(
        "Zhenya" to 5,
        "Vlad" to 3,
        "Nina" to 5,
    )
//    print(students)

//    val (name,grade) = Pair("Zhenya",5)
//    print("$name $grade")

//    val p = Pair(2, 3)
//    println("${p.first} ${p.second}") // 2 3
//    val (first, second) = p
//    println("$first $second")

    val (name, grade) = "Vlad" to 4
    println("Student name is: $name And their grade is: $grade")
// output: Student name is: Vlad And their grade is: 4

    val staff = mapOf<String, Int>(
        "John" to 1000,
        "Sena" to 1000
    )
    val emptyStringToDoubleMap = emptyMap<String, Double>()

    val values = mapOf("Second" to 2, "Third" to 3)
    val map = buildMap<String, Int> {
        put("First", 1)
        putAll(values)
        put("Fourth", 4)
    }
//    println(map.toList()[0].first)
    val isWanted = map.containsKey("First")
//    println("$isWanted")

    val isAnyoneWilling = map.containsValue(3)
//    println("Is anyone willing to earn $500? It's $isAnyoneWilling")

    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )
//
//    for (employee in employees)
//        println("${employee.key} ${employee.value}")
//
//    for ((k, v) in employees)
//        println("$k $v")

//    fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
//        return priceList.filter { shoppingList.contains(it.key) }.values.sum()
//    }

fun summator(map: Map<Int, Int>): Int {
    return map.filterValues { it % 2 != 0 }.values.sum()
}
}