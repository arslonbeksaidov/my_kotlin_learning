import java.io.File

fun main() {
    val fileName = "src/reading.txt"
    val text = File(fileName).readText()
    println(text)
}