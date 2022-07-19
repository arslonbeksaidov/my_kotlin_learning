package codeforces

fun main() {
    val size = readLine()?.toInt()
    for (x in 1..size!!) {
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }
        for (x in 1..n) {
            val (b, text) = readln().split(" ")
            val u = text.filter {
                it == 'U'
            }.count()
            val d = text.length - u
            print("${(a[x - 1] - u + d + 10) % 10} ")
        }
        print("\n")
    }
}