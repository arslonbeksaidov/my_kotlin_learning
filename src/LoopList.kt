import java.util.*;

fun main() {
//    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8)
//    for (item in numbers)
//    {
//        println(item)
//    }

//    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8)
//    for (item in numbers.indices){
//        println("${numbers[item]}")
//    }

//    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8)
//
//    for (item in 1..5){
//        println(numbers[item])
//    }

//    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8)
//    for (index in 1 until numbers.lastIndex) {
//        println("$index: ${numbers[index]}")
//    }

//    val size = readLine()!!.toInt()
//    val mutableList: MutableList<Int> = mutableListOf()
//    for (i in 0 until size){
//        mutableList.add(readLine()!!.toInt())
//    }

//    for (item in mutableList.lastIndex downTo 0){
//        println(mutableList[item])
//    }

//    Task
//    val size = readLine()!!.toInt()
//    val mutableList:MutableList<Int> = mutableListOf()
//    for (item in 0 until size)
//    {
//        mutableList.add(readLine()!!.toInt())
//    }
//    val vanted = readLine()!!.toInt()
//    if (mutableList.indexOf(vanted)!=-1){
//        println("YES")
//    }else{
//        println("NO")
//    }

//    val size = readLine()!!.toInt()
//    val list: MutableList<Int> = mutableListOf()
//    for (item in 0 until size) {
//        list.add(readLine()!!.toInt())
//    }
//    val rotate = readLine()!!.toInt()
//    Collections.rotate(list, rotate);
//    println(list.joinToString(" "))

//
//    val size = readLine()!!.toInt()
//    val list: MutableList<Int> = mutableListOf()
//
//    for (i in 1..size) {
//        list.add(readLine()!!.toInt())
//    }
//    val rotate_number = readLine()!!.toInt() % size
//
//    repeat(rotate_number){
//        rotateListOnce(list)
//    }
//    println(list.joinToString(" "))
//
//}
//
//fun rotateListOnce(l: MutableList<Int>) {
//    l.add(0, l.last())
//    l.removeAt(l.lastIndex)
//

//    val elementList = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
//    val p_m = readLine()!!.split(" ").toList()
//    var equalList: MutableList<Int> = mutableListOf()
//    var first: Int = p_m[0].toInt()
//    var second: Int = p_m[1].toInt()
//    var ans: String = "YES"
//    for (item in 0 until elementList.size) {
//        if (item > 0) {
//            if ((elementList[item - 1] == first && elementList[item] == second) || (elementList[item - 1] == second && elementList[item] == first)) {
//                ans = "NO"
//                break
//            }
//        }
//    }
//    println(ans)

//val list = MutableList(readLine()!!.toInt()){
//    readLine()!!.toInt()
//}
//val num = readLine()!!.toInt()
//    var counter:Int = 0
//    for (item in list){
//        if (item == num) counter++
//    }
////    println(list.count { it == num }) or
}