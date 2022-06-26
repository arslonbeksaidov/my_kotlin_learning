fun main() {
//    val visitors = setOf<String>("Arslon", "Bobur", "Daston")
//    println(visitors)
    val emptySet = emptySet<String>()
    val set = buildSet<Char> {
        add('3')
        add('5')
        addAll(setOf('2', '3', 'd', '6'))
    }
//    println(set)
    println(set.contains('2'))
    println(set)
    println(set.indexOf('6'))
    println(set.first())
    println(set.last())
    println(set.joinToString())
    println(set.joinToString { it.uppercase() })

//    val productsList1 = setOf("Banana", "Lime", "Strawberry")
//    val productsList2 = setOf("Strawberry")
//
//    val finalProductsList1 = productsList1 + productsList2
//    println(finalProductsList1) // [Banana, Lime, Strawberry]
//
//    val finalProductsList2 = productsList1 - productsList2
//    println(finalProductsList2) // [Banana, Lime]
//

//    val groceries = mutableListOf<String>("Pen", "Pineapple", "Apple", "Super Pen", "Apple", "Pen")
//    println(groceries.toSet())

//    val visitors = setOf("Vlad", "Liza", "Vanya", "Nina")
//
//    for (visitor in visitors) {
//        println("Hello $visitor!")
//    }

//    fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int = (numbers1 - numbers2).size
}