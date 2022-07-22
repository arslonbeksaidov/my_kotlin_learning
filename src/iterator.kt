
fun processIterator(list: List<String>): List<String> {
    return list.toMutableList().filter { it.startsWith("hyper") }.toList()
}
fun main() {
//    var set = setOf("cat", "dog", "crocodile", "snake")
//    var iterator = set.iterator()
//
//    while (iterator.hasNext()) {
//        print(iterator.next() + " ")// cat dog crocodile snake
//    }

//    val map = mapOf("John" to "chocolote", "Mary" to "sweets", "Sara" to "marmelate")
//    var iterator2 = map.iterator()

//    iterator2.forEach { (key, value) ->
//        println("$key likes $value")
//    }

//    val food = mutableSetOf<String>("donuts", "cakes", "tarts")
//    val mutableIterator = food.iterator()
//    mutableIterator.next()
//    mutableIterator.remove()
//    println("Result : $food")
////////////////////////////////////////////////////////////////////////
//    val strings = listOf<String>("I", "like", "donuts")
//    val listIterator = strings.listIterator()
//    while (listIterator.hasNext()) listIterator.next()

//    println("Iterating backwards:")
//    while (listIterator.hasPrevious()) {
//        print("index: ${listIterator.previousIndex()}")
//        println(", value: ${listIterator.previous()}")
//    }
/////////////////////////////////////////////////////////////////////
//    val words = mutableListOf("i", "know", "Claire")
//    val mutableListIterator = words.listIterator()
//
//    mutableListIterator.next()
//    mutableListIterator.next()
//    mutableListIterator.set("don't know")// i , don't know, Claire
//    mutableListIterator.add("John")
//    println(words)// i, don't know, John, Claire




    val list = processIterator(readln().split(" ")).listIterator()
    while (list.hasNext()) list.next()
    while (list.hasPrevious()) println(list.previous())

}