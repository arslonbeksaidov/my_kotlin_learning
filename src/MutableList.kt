import java.util.*
import kotlin.math.sign

fun main() {
//    val floatNumbers = mutableListOf(10.5, 5.6, 9.4)
//    println(floatNumbers)

//    val numbers = mutableListOf<Int>(1,2,3,4,5)
//    println(numbers)
//
//    val strings = mutableListOf<String>("ddfdf","dfdf")
//    println(strings)
//
//    val chars = mutableListOf<Char>('f','g')
//    println(chars)
//
//    val booleans = mutableListOf<Boolean>(true,false)
//    println(booleans)

//    val numbers = MutableList(5){ readLine()!!.toInt() }
//    println(numbers)

//    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
//    println(numbers)
//
//    val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
//    val str = "1 2\t\t3  4\t5  6"
//    val nums = str.split(regex).map { it.toInt() }.toMutableList()
//    println(nums.joinToString())

//Mutable List

//    val list = MutableList(6){7}
//    println(list)

//    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
//    println(numbers.size)
//    changing value
//    numbers[0] = 10
//    println(numbers[0])
//    println(numbers.first())
//    println(numbers.last())
//    println(numbers.lastIndex)

//    Tasks 1

//    val numbers = MutableList(100){0}
//    numbers[0] = 1
//    numbers[9] = 10
//    numbers[100-1] = 100

//    Task 2

//    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
//    Collections.swap(numbers, 0, numbers.lastIndex)
//    or

//    Task 3
//val longs = mutableListOf<Long>(100_000_000_001, 100_000_000_002, 100_000_000_003)
//println(longs.joinToString())

//    learn
//    println(mutableListOf<Int>(1,2,3).joinToString("-"))

//    jointing multiple lists

//    val one = mutableListOf<Int>(1,2,3,4)
//    val two = mutableListOf<Int>(1,2,3,4)
//    println((one + two).joinToString("->"))
//    println(one == two)
//    println(one === two)

//    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
//    var stars = mutableListOf("Ginan", "Mu Crucis")
//    southernCross[1] = "star"
//    stars[1] = "star"

//    remove, add, clear
//    val strings = mutableListOf<String>("arslon","saidov","941")
//    println(strings)
//    strings.removeAt(2)
//    println(strings)
//    strings.remove("saidov")
//    println(strings)
//    strings.add(1,"Saidov")
//    println(strings)
//    strings.add("PHD")
//    println(strings)
//    strings.clear()
//    println(strings)
//    strings.addAll(mutableListOf("1996","19","09"))
//    println(strings)
//    strings+= mutableListOf<String>("45","78")
//    println(strings)
//    strings+="99"
//    println(strings)

//    copying
//    val list = mutableListOf<Int>(1,2,3)
//    val copyiedList = list.toMutableList()
//    println(copyiedList)
//    println(copyiedList == list)
//    println(copyiedList === list)
//

//    checking
//    val numbers = mutableListOf<Int>(1,2,3)
//    if (numbers.isNotEmpty() && numbers.size > 2){
//        println(numbers.subList(0,1))// second argument one few
//    }

//    searching
//    val numbers = mutableListOf<Int>(1,2,3,3,4,5,6)
//    if (4 in numbers){
//        println(numbers.indexOf(3))
//    }
//    min and max
    val numbers = mutableListOf<Int>(1,2,3)
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(numbers.sum())
    println(numbers.sortedDescending())
    println(numbers.sorted())

//    Task
//    val strings = mutableListOf<String>()
}
