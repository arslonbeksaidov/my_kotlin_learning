import kotlin.math.sign

fun main() {
//    val strings = "dfdf"
//    for (x in 0 until strings.length){
//        println(strings[x])
//    }
//    println(strings.first())
//    println(strings.last())
//    println(strings.lastIndex)

//    val strings = "dfdfdf"
//    println(strings.isEmpty())
//    println(strings.length == 0)

//    Strings are immutable
//    val strings:String = "dfddf"
//    strings[0] = "4"// error because it is immutable
//    var strings2 = "fdfdf"
//    strings2[2]= 55 // error


//  If you need to change the string, you can reassign it:

//    var strings = "dfdfdf"
//    strings = "777"
//    println(strings)

//    val first_name = readLine()!!.toString()
//    val last_name = readLine()!!.toString()
//    println("${first_name[0]}. $last_name")

//    val strings = "Arslon Saidov"
//    println(strings.substring(0,5))
//    println(strings.substringAfter("S"))
//    println(strings.substringBefore("S"))
//    println(strings.replace("Arslon","Arslonbek"))
//    println(strings.replaceFirst("Arslon","Arslonbek"))
//    println(strings.uppercase())

//    var strings = readLine()!!.toString()
//    strings = strings.last() + strings.substring(1,strings.lastIndex) + strings.first()
//
//    println(strings)

//    println("content".substring(-1, -1))
//    println("content".substringAfter("t"))
//    println("content".substring(1, 1))
//    println("content".substring(0, 0))
//    println("content".substring(0, 1))
//    println("content".substringBefore("c"))
//    println(readLine()!!.toString().uppercase() == readLine()!!.toString().uppercase())

//    val strings:String = "sdfghjkl"
//    val wordList:List<String> = strings.split("")
//    println(wordList)
//    val wordMutable:MutableList<String> = strings.split("").toMutableList()
//    println(wordMutable)

//    val rainbow = "fdfdfdf"
//    for (index in rainbow.indices){
//        println("$index ${rainbow[index]}")
//    }

//    val nums = readLine()!!.toString().toList().map { it.code }.toList()
//    var left = 0
//    var right = 0;
//    for (index in 0..nums.lastIndex) {
//        if (index < nums.size / 2){
//           left +=nums[index]
//        }else{
//            right+=nums[index]
//        }
//    }
//
//    if (right == left)
//    {
//        println("YES")
//    }else{
//        println("NO")
//    }


//    val strings = readLine()!!.toString().uppercase()
//    var count = 0
//    for (item in strings)
//    {
//        if (item == 'G' || item == 'C'){
//            count++
//        }
//    }
//    val ans =(count.toDouble() / strings.length) * 100
//    println(ans)

//    val strings = readLine()!!.toString()
//    var newString = ""
//
//    for (item in strings)
//    {
//        newString+=item
//        newString+=item
//    }
//
//    println(newString)


//    var newString = ""
//    val strings = readLine()!!.toString().split(" ")
//    for (item in strings){
//        if (item.length > newString.length){
//            newString = item
//        }
//    }
//
//    println(newString)




}
