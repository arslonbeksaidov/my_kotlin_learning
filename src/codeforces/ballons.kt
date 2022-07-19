package codeforces

fun main(){
 val size_text = readLine()?.toInt()
    for (x in 1..size_text!!){
        val n = readln()
        val text = readln()
        println(text.length + text.toSet().size)
    }
}