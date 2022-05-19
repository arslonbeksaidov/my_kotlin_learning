import kotlin.math.abs

const val EMPTY_CELL = '_'
const val X_CELL = 'X'
const val O_CELL = 'O'
fun main() {


    println("---------")
    println("|       |")
    println("|       |")
    println("|       |")
    println("---------")
    fun drowGame(updatedItems: MutableList<MutableList<Char>>) {

        println("---------")
        for (x in 0..2) {
            println("| ${updatedItems[x].joinToString(" ")} |")
        }
        println("---------")
    }

    fun checkWinner(board: MutableList<MutableList<Char>>): String {
        var isWinX = false
        var isWinO = false
        var countEmptyCells = 0
        var countX = 0;
        var countO = 0
        for (i in 0..7) {
            val line = when (i) {
                0 -> "${board[i][0]}${board[i][1]}${board[i][2]}"
                1 -> "${board[i][0]}${board[i][1]}${board[i][2]}"
                2 -> "${board[i][0]}${board[i][1]}${board[i][2]}"
                3 -> "${board[0][0]}${board[1][0]}${board[2][0]}"
                4 -> "${board[0][1]}${board[1][1]}${board[2][1]}"
                5 -> "${board[0][2]}${board[1][2]}${board[2][2]}"
                6 -> "${board[0][0]}${board[1][1]}${board[2][2]}"
                7 -> "${board[2][0]}${board[1][1]}${board[0][2]}"
                else -> {
                    ""
                }
            }
            if (line == "XXX") {
                isWinX = true
            }
            if (line == "OOO") {
                isWinO = true
            }
        }
        for (i in 0 until board.size) {
            countEmptyCells += board[i].count { it == EMPTY_CELL }
            countO += board[i].count { it == O_CELL }
            countX += board[i].count { it == X_CELL }
        }

        if (isWinO) return "O wins"
        if (isWinX) return "X wins"
        return "NO"
    }

    val ticTacMatrix: MutableList<MutableList<Char>> =
        mutableListOf(mutableListOf(' ', ' ', ' '), mutableListOf(' ', ' ', ' '), mutableListOf(' ', ' ', ' '))
    var queque = "X"
    while (true)
        try {
            println("Enter the coordinates: ")
            val input = readLine()!!.split(" ")
            val ans = mutableListOf<String>()
            for (x in input){
                if (x !="" && x !=" "){
                    ans.add(x.toString())
                }
            }
            val corditanes = ans.map { it.toInt() }
            if (corditanes[0] !in 1..3 || corditanes[1] !in 1..3) {
                throw Exception("Coordinates should be from 1 to 3!")
            }

            if (ticTacMatrix[corditanes[0] - 1][corditanes[1] - 1] in listOf('X', 'O')) {
                throw Exception("This cell is occupied! Choose another one!")
            }
            if (queque == "X") {
                ticTacMatrix[corditanes[0] - 1][corditanes[1] - 1] = 'X'
                queque = "O"
            } else {
                ticTacMatrix[corditanes[0] - 1][corditanes[1] - 1] = 'O'
                queque = "X"
            }

            drowGame(ticTacMatrix)
            if (checkWinner(ticTacMatrix) == "NO") {
                continue
            } else {
                println(checkWinner(ticTacMatrix))
                break
            }
        } catch (e: NumberFormatException) {
            println("You should enter numbers!")
        } catch (e: Exception) {
            println(e.message)
        }


}