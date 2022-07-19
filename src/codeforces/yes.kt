package codeforces


fun main() {
    val size = readLine()?.toInt()
    for (x in 1..size!!) {
        val text = readln()
        if (text.uppercase() == "YES") println("YES") else println("NO")
    }

}