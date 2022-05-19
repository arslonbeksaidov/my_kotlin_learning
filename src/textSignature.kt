import java.util.Scanner

fun main() {
    fun simpleASCII() {
        val fullName = readLine()!!
        val lengthFullName = fullName.length

        repeat(lengthFullName + 4) {
            print("*")
        }
        println()
        print("* ${fullName} *")
        println()
        repeat(lengthFullName + 4) {
            print("*")
        }
    }

    fun repeat(number: Int, value: String = "*", addPrintln: Boolean) {
        repeat(number) {
            print(value)
        }
        if (addPrintln) {
            println()
        }
    }



    fun mediumASCII() {
        val A = mutableListOf("____", "|__|", "|  |")
        val B = mutableListOf("___ ", "|__]", "|__]")
        val C = mutableListOf("____", "|   ", "|___")
        val D = mutableListOf("___ ", "|  \\", "|__/")
        val E = mutableListOf("____", "|___", "|___")
        val F = mutableListOf("____", "|___", "|   ")
        val G = mutableListOf("____", "| __", "|__]")
        val H = mutableListOf("_  _", "|__|", "|  |")
        val I = mutableListOf("_", "|", "|")
        val J = mutableListOf(" _", " |", "_|")
        val K = mutableListOf("_  _", "|_/ ", "| \\_")
        val L = mutableListOf("_   ", "|   ", "|___")
        val M = mutableListOf("_  _", "|\\/|", "|  |")
        val N = mutableListOf("_  _", "|\\ |", "| \\|")
        val O = mutableListOf("____", "|  |", "|__|")
        val P = mutableListOf("___ ", "|__]", "|   ")
        val Q = mutableListOf("____", "|  |", "|_\\|")
        val R = mutableListOf("____", "|__/", "|  \\")
        val S = mutableListOf("____", "[__ ", "___]")
        val T = mutableListOf("___", " | ", " | ")
        val U = mutableListOf("_  _", "|  |", "|__|")
        val V = mutableListOf("_  _", "|  |", " \\/ ")
        val W = mutableListOf("_ _ _", "| | |", "|_|_|")
        val X = mutableListOf("_  _", " \\/ ", "_/\\_")
        val Y = mutableListOf("_   _", " \\_/ ", "  |  ")
        val Z = mutableListOf("___ ", "  / ", " /__")


        var l = ""
        print("Enter name and surname: ")
        val first_last_name = readLine()!!
        print("Enter person's status: ")
        val status = readLine()!!
        var top = ""
        var middle = ""
        var buttom = ""
        for (x in first_last_name) {
            when (x.lowercase()) {
                "a" -> {
                    top += A[0] + " "
                    middle += A[1] + " "
                    buttom += A[2] + " "
                }
                "b" -> {
                    top += B[0] + " "
                    middle += B[1] + " "
                    buttom += B[2] + " "
                }
                "c" -> {
                    top += C[0] + " "
                    middle += C[1] + " "
                    buttom += C[2] + " "
                }
                "d" -> {
                    top += D[0] + " "
                    middle += D[1] + " "
                    buttom += D[2] + " "
                }
                "e" -> {
                    top += E[0] + " "
                    middle += E[1] + " "
                    buttom += E[2] + " "
                }
                "f" -> {
                    top += F[0] + " "
                    middle += F[1] + " "
                    buttom += F[2] + " "
                }
                "g" -> {
                    top += G[0] + " "
                    middle += G[1] + " "
                    buttom += G[2] + " "
                }
                "h" -> {
                    top += H[0] + " "
                    middle += H[1] + " "
                    buttom += H[2] + " "
                }
                "i" -> {
                    top += I[0] + " "
                    middle += I[1] + " "
                    buttom += I[2] + " "
                }
                "j" -> {
                    top += J[0] + " "
                    middle += J[1] + " "
                    buttom += J[2] + " "
                }
                "k" -> {
                    top += K[0] + " "
                    middle += K[1] + " "
                    buttom += K[2] + " "
                }
                "l" -> {
                    top += L[0] + " "
                    middle += L[1] + " "
                    buttom += L[2] + " "
                }
                "m" -> {
                    top += M[0] + " "
                    middle += M[1] + " "
                    buttom += M[2] + " "
                }
                "n" -> {
                    top += N[0] + " "
                    middle += N[1] + " "
                    buttom += N[2] + " "
                }
                "o" -> {
                    top += O[0] + " "
                    middle += O[1] + " "
                    buttom += O[2] + " "
                }
                "p" -> {
                    top += P[0] + " "
                    middle += P[1] + " "
                    buttom += P[2] + " "
                }
                "q" -> {
                    top += Q[0] + " "
                    middle += Q[1] + " "
                    buttom += Q[2] + " "
                }
                "r" -> {
                    top += R[0] + " "
                    middle += R[1] + " "
                    buttom += R[2] + " "
                }
                "s" -> {
                    top += S[0] + " "
                    middle += S[1] + " "
                    buttom += S[2] + " "
                }
                "t" -> {
                    top += T[0] + " "
                    middle += T[1] + " "
                    buttom += T[2] + " "
                }
                "u" -> {
                    top += U[0] + " "
                    middle += U[1] + " "
                    buttom += U[2] + " "
                }
                "v" -> {
                    top += V[0] + " "
                    middle += V[1] + " "
                    buttom += V[2] + " "
                }
                "w" -> {
                    top += W[0] + " "
                    middle += W[1] + " "
                    buttom += W[2] + " "
                }
                "x" -> {
                    top += X[0] + " "
                    middle += X[1] + " "
                    buttom += X[2] + " "
                }
                "y" -> {
                    top += Y[0] + " "
                    middle += Y[1] + " "
                    buttom += Y[2] + " "
                }
                "z" -> {
                    top += Z[0] + " "
                    middle += Z[1] + " "
                    buttom += Z[2] + " "
                }
                " " -> {
                    top += "     "
                    middle += "     "
                    buttom += "     "
                }
            }
        }

        if (top.length > status.length) {

            repeat(top.length + 5, addPrintln = true)
            println("*  $top *")
            println("*  $middle *")
            println("*  $buttom *")
            var differ = top.length + 5 - status.length
            if (differ % 2 == 0) {
                differ /= 2
                print("*")
                repeat(differ - 1, " ", addPrintln = false)
                print(status)
                repeat(differ - 1, " ", addPrintln = false)
                print("*")
                println()
            } else {
                val left = (top.length + 5 - status.length) / 2
                val right = left + 1
                print("*")
                repeat(left - 1, " ", addPrintln = false)
                print(status)
                repeat(right - 1, " ", addPrintln = false)
                print("*")
                println()
            }
            repeat(top.length + 5, addPrintln = true)

        } else {

            repeat(status.length + 6, addPrintln = true)
            val wide = status.length + 6
            val top_length = top.length - 1
            var differ = wide - top_length
            if (differ % 2 == 0) {
//                println("even")
                differ /= 2
                print("*")
                repeat(differ - 1, " ", addPrintln = false)
                print(top.dropLast(1))
                repeat(differ - 1, " ", addPrintln = false)
                print("*\n")
                print("*")
                repeat(differ - 1, " ", addPrintln = false)
                print(middle.dropLast(1))
                repeat(differ - 1, " ", addPrintln = false)
                print("*\n")
                print("*")
                repeat(differ - 1, " ", addPrintln = false)
                print(buttom.dropLast(1))
                repeat(differ - 1, " ", addPrintln = false)
                print("*\n")
            } else {
                val left = differ / 2
                val right = left + 1
                print("*")
                repeat(left-1, " ", addPrintln = false)
                print(top.dropLast(1))
                repeat(right-1, " ", addPrintln = false)
                print("*\n")
                print("*")
                repeat(left-1, " ", addPrintln = false)
                print(middle.dropLast(1))
                repeat(right-1, " ", addPrintln = false)
                print("*\n")
                print("*")
                repeat(left-1, " ", addPrintln = false)
                print(buttom.dropLast(1))
                repeat(right-1, " ", addPrintln = false)
                print("*\n")

            }
            println("*  $status  *")
            repeat(status.length + 6, addPrintln = true)
        }
    }
    mediumASCII()
}
