import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.fixedRateTimer

fun main() {
//    for (i in 1..4) {
//        for (j in 1..4) {
//            if (j == 2) continue // you want to ignore j = 2
//            if (i <= j) break    // you will print the string if i is greater than j
//            println("i = $i")
//            println( "j = $j")
//        }
//        println("Finished to examine i = $i")
//    }

//    loop@ for (i in 1..3) {
//        for (j in 1..3) {
//            println("i = $i, j = $j")
//            if (j == 3) break@loop
//        }
//    }


//    loop@ for (i in 1..3){
//        for (j in 1..3){
//            for (k in 1..3){
//                if (k == 2) continue@loop
//                println("i = $i, j = $j, k = $k")
//            }
//        }
//    }


//    loop@for (i in 1..10) {
//        when (i) {
//            3 -> continue@loop
//            6 -> break@loop
//            else -> println(i)
//        }
//    }


//    loop@ for (i in 1..10) {
//        for (j in 1..10) {
//            when (j) {
//                3 -> continue@loop
//                6 -> break@loop
//                else -> {
//                    when (i) {
//                        !in 1..7 -> continue@loop
//                        else -> println("i = $i, j = $j")
//                    }
//
//                }
//            }
//        }
//    }


//    for (i in 1..10) {
//        for (j in 1..10) {
//            println("i = $i, j = $j")
//            if (j == 3) return
//        }
//    }


//    task 1
//    val scanner = Scanner(System.`in`)
//    fun buttleField() {
//        val fiels: MutableList<MutableList<Int>> = mutableListOf()
//        val rowList = mutableListOf<Int>()
//        val columnList = mutableListOf<Int>()
//        for (x in 1..3) {
//            val array = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
//            rowList.add(array[1])
//            columnList.add(array[0])
//        }
//
//        var count = 0
//        val coordinateRows = mutableListOf<Int>()
//        val coordinateColumns = mutableListOf<Int>()
//        for (num in 1..5) {
//            for (x in rowList) {
//                if (num != x) {
//                    count++
//                } else {
//                    count = 0
//                }
//            }
//            if (count == 3) {
//                coordinateRows.add(num)
//            }
//            count = 0
//        }
//
//        var count1 = 0
//        for (num1 in 1..5) {
//            for (p in columnList) {
//                if (num1 != p) {
//                    count1++
//                } else {
//                    count1 = 0
//                }
//            }
//            if (count1 == 3) {
//                coordinateColumns.add(num1)
//            }
//            count1 = 0
//        }
//        println(coordinateColumns.joinToString(" "))
//        println(coordinateRows.joinToString(" "))
//    }
//    buttleField()


//    val until = readLine()!!.toCharArray()[0]
//    for (x in 'a'..until - 1) {
//        print(x)
//    }
//
//    val until = readLine()!!
//    for (x in 97 until until.first().code) {
//        print(x.toChar())
//    }

//    val word = readLine()!!
//    for (x in 'a'..'z'){
//        if (!word.contains(x))
//        print(x)
//    }


//    val word = readLine()!!
//    for (x in word){
//        if (x in '0'..'9'){
//            println(x)
//            break
//        }
//    }


//    for (i in 1..4) {
//        loop@ for (j in 1..3) {
//            for (k in 1..2) {
//                if (i == 2 || j == 3 || k == 2) break@loop
//                print("$k")
//            }
//        }
//    }

    val word = readLine()!!
    var countDistinc = 0
    loop@ for (y in word) {
        var count = 0
        for (x in word) {
            if (x == y) {
                count++
                if (count >= 2) {
                    continue@loop
                }
            }
        }
        if (count == 1) {
            countDistinc++
        }
    }

    println(countDistinc)


}