package OOP

fun resume(marks: Triple<String, Int, List<Double>>): Pair<String, Double> {
    val ans = marks.third.sum() / marks.third.size
    return Pair(first = marks.first, second = ans)
}

fun sum(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Pair<Int, Int> {
    return Pair(first = p1.first + p2.first, second = p2.second + p1.second)
}
    fun main() {

        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        val (c, d) = readLine()!!.split(' ').map { it.toInt() }
        val pairOne = Pair(a, b)
        val pairTwo = Pair(c, d)
        println(sum(pairOne, pairTwo))


//    val pair = Pair(1,"one")
//    println(pair)
//    println(pair.copy(first = 1, second = "dfdfdf"))
//    println(pair.second)

//    val pair = 1 to "one"
//    println(pair)

//    val pairOne = Pair(1, listOf(1,2,3,4,5))
//    println(pairOne.component1())
//    println(pairOne.component2())
//    println(pairOne.toString())
//    println(pairOne.toList())

        println("you-are-hired")
//    val pair = Pair("marks", listOf(8.0, 9.0, 10.0))
//    val other = pair.copy("other")
//    val grades = pair.copy(second = listOf(9.0, 7.0, 8.5))
//    println(pair) // (marks, [8.0, 9.0, 10.0])
//    println(other) // (other, [8.0, 9.0, 10.0])
//    println(grades) // (marks, [9.0, 7.0, 8.5])

//    //////////////////////   --Triple--  ///////////////////////////////////////////

//    val Triple = Triple(1,"Arslon", listOf(1,2,0,4,5,6))
//
//    println(Triple.component3())
//    println(Triple.third)
//    println(Triple.copy(first = 44, second = "gfds"))
//

        // put you code here
//    val (name, age) = readln().split(" ")
//    val pair = Pair(name, age)
//    println(pair)


//    println(resume(Triple("Arslon", 44, listOf<Double>(2.4, 4.5, 6.0))))

    }