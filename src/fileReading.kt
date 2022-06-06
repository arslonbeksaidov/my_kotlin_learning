import java.io.File
import kotlin.math.max

fun main() {
    val fileName = "src/reading.txt"
    val text = File(fileName).readText()
    println(text)

//    by creating reference
//    val file = File(fileName)
//    val lines = file.readText()
//    println(lines)

//     checking file existence by exception
//    val file2 = "src/reading2.txt"
//    val secondFile = File(file2)
//    if (secondFile.exists()) {
//        val lines = secondFile.readText()
//        println(lines)
//    } else print("No such file")

//    can be given specific charset
//    val lines = File(fileName).readText(Charsets.US_ASCII)

//    can use length and delete
//    val file = File(fileName)
//    if (file.exists()){
//        println(file.length())
//        file.delete()
//    }
//    creating file
//    file.createNewFile()

//    Readlines :

//    val lines = File(fileName).readLines()
//    for (x in lines){
//        println(x)
//    }

//    val lines = File(fileName).readBytes()
//    println(lines)

//    File(fileName).forEachLine { println(it) }

//    val word_sequence = "src/word_sequence.txt"
//    val word_sequences = File(word_sequence).readLines()
//
//    var maxWord = 0
//    for (x in word_sequences) {
//        if (x.length > maxWord) {
//            maxWord = x.length
//        }
//    }
//    println(maxWord)

//----------------------------------------------------------
//    val word_sequence = "src/words_with_numbers.txt"
//
//    var maxNumberCount = 0
//    File(word_sequence).forEachLine {
//        if (it.first().isDigit()) maxNumberCount++
//    }
//
//    println(maxNumberCount)

//---------------------------------------------------------

//    val file = "src/text.txt"
//    var count = File(file).readText().split(" ").size
//    println(count)

}