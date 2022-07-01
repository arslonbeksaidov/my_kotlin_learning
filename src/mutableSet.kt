fun main() {
    val groceries = mutableSetOf<String>("banan", "apple")
    groceries.add("watermelon")
    println(groceries)
    val points = mutableSetOf<Int>()
    points.add(3)
    points.addAll(mutableSetOf(1,2,3,4))
    println(points)
//    points.remove(4)
    points.removeAll(mutableSetOf(1,3))
    println(points)
    points.clear()
    val places = mutableSetOf("Saint-Petersburg", "Moscow", "Grodno", "Rome")

    for (place in places) {
        println(place)
    }
}