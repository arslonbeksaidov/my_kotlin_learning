fun main() {
//    val daysOfWeek = arrayOf("Sum", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//    for (day in daysOfWeek){
//        println(day)
//    }
//    -----------------------------------------------------------------------------
//via indexes
//    for (index in daysOfWeek.indices) {
//        println("$index: ${daysOfWeek[index]}")
//    }
//    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//
//    for (index in 1..5) {
//        println("$index: ${daysOfWeek[index]}")
//    }
//---------------------------------------------------------------------------
    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in daysOfWeek.lastIndex downTo 0 step 2) {
        println("$index: ${daysOfWeek[index]}")
    }
//----------------------------------------------------------------------------------------------
//    val size = readln().toInt()
//    val array = IntArray(size)
//    for (i in 0..array.lastIndex) {
//        array[i] = readln().toInt()
//    }
//
//    for (i in array.lastIndex downTo 0) {
//        println("${array[i]}")
//    }
//    ----------------------------------------------------------------------------------------
//    val size = readln().toInt()
//    val array = IntArray(size)
//    for (i in 0..array.lastIndex) {
//        array[i] = readln().toInt()
//    }
//    val searched = readln().toInt()
//    var count = 0
//    array.forEach {
//        if (it == searched) {
//            count++
//        }
//    }
//    println(count)
//    --------------------------------------------------------------------
//    val sizeArray:Int = readln().toInt()
//    val array = IntArray(sizeArray)
//    for (index in 0..array.lastIndex){
//        array[index] = readln().toInt()
//    }
//    val searchedValue = readln().toInt()
//    if (array.contains(searchedValue)){
//        println("YES")
//    }else{
//        println("NO")
//    }
//    --------------------------------------------------------------------
//    val arraySize = readln().toInt()
//    val array = IntArray(arraySize)
//    for (index in array.indices) {
//        array[index] = readln().toInt()
//    }
//    var minValue = Int.MIN_VALUE
//
//    for (item in array){
//        if (item > minValue) minValue = item
//    }
//    println(array.indexOf(minValue))
}