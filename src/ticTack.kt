import kotlin.math.abs

fun main() {


    print("Enter cells:")
    val items = readLine()!!.split("").toMutableList()
    items.removeIf { it == "" }
    println("---------")
    for (x in 0..8) {
        if (x == 0 || x == 3 || x == 6) {
            print("| ${items[x]} ")
        } else if (x == 2 || x == 5 || x == 8) {
            print("${items[x]} |")
        } else {
            print("${items[x]} ")
        }
        if (x == 2 || x == 5 || x == 8) {
            println()
        }
    }
    println("---------")

    val oCount = items.count { it == "O" }
    val xCount = items.count { it == "X" }
    val _Count = items.count { it == "_" }

    val isFull = _Count == 0


    if (abs(oCount - xCount) > 1) {
        println("Impossible")
        return
    }


    var rowX1 = false
    var rowO1 = false

    var rowX2 = false
    var rowO2 = false

    var rowX3 = false
    var rowO3 = false

    var columnX1 = false
    var columnO1 = false

    var columnX2 = false
    var columnO2 = false

    var columnX3 = false
    var columnO3 = false

    var leftDiaganalX = false
    var leftDiaganalO = false

    var rightDiaganalX = false
    var rightDiaganalO = false

    var countRowX1 = 0
    var countRowO1 = 0

    var countRowX2 = 0
    var countRowO2 = 0

    var countRowX3 = 0
    var countRowO3 = 0

    var countColumnX1 = 0
    var countColumnO1 = 0

    var countColumnX2 = 0
    var countColumnO2 = 0

    var countColumnX3 = 0
    var countColumnO3 = 0

    var countLeftDiaganalX = 0
    var countLeftDiaganalO = 0

    var countRightDiaganalX = 0
    var countRightDiaganalO = 0







    for (x in 0..8) {
        if (x in 0..2) {
            if ("X" == items[x]) {
                countRowX1++
            }
            if ("O" == items[x]) {
                countRowO1++
            }

            if (x == 2) {
                if (countRowX1 == 3) rowX1 = true
                if (countRowO1 == 3) rowO1 = true
            }
        }

        if (x in 3..5) {
            if ("X" == items[x]) {
                countRowX2++
            }
            if ("O" == items[x]) {
                countRowO2++
            }

            if (x == 5) {
                if (countRowX2 == 3) rowX2 = true
                if (countRowO2 == 3) rowO2 = true
            }
        }

        if (x in 6..8) {
            if ("X" == items[x]) {
                countRowX3++
            }
            if ("O" == items[x]) {
                countRowO3++
            }

            if (x == 8) {
                if (countRowX3 == 3) rowX3 = true
                if (countRowO3 == 3) rowO3 = true
            }
        }


        if (x in listOf(0, 3, 6)) {
            if ("X" == items[x]) {
                countColumnX1++
            }

            if ("O" == items[x]) {
                countColumnO1++
            }
            if (x == 6) {
                if (countColumnX1 == 3) columnX1 = true
                if (countColumnO1 == 3) columnO1 = true
            }

        }


        if (x in listOf(1, 4, 7)) {
            if ("X" == items[x]) {
                countColumnX2++
            }

            if ("O" == items[x]) {
                countColumnO2++
            }
            if (x == 7) {
                if (countColumnX2 == 3) columnX2 = true
                if (countColumnO2 == 3) columnO2 = true
            }

        }

        if (x in listOf(2, 5, 8)) {
            if ("X" == items[x]) {
                countColumnX3++
            }

            if ("O" == items[x]) {
                countColumnO3++
            }
            if (x == 8) {
                if (countColumnX3 == 3) columnX3 = true
                if (countColumnO3 == 3) columnO3 = true
            }
        }

        if (x in listOf(0, 4, 8)) {
            if ("X" == items[x]) {
                countLeftDiaganalX++
            }

            if ("O" == items[x]) {
                countLeftDiaganalO++
            }
            if (x == 8) {
                if (countLeftDiaganalX == 3) leftDiaganalX = true
                if (countLeftDiaganalO == 3) leftDiaganalO = true
            }
        }

        if (x in listOf(2, 4, 6)) {
            if ("X" == items[x]) {
                countRightDiaganalX++
            }

            if ("O" == items[x]) {
                countRightDiaganalO++
            }
            if (x == 6) {
                if (countRightDiaganalX == 3) rightDiaganalX = true
                if (countRightDiaganalO == 3) rightDiaganalO = true
            }
        }
    }



    if ((rowX1 || rowX2 || rowX3 || columnX1 || columnX2 || columnX3 || leftDiaganalX || rightDiaganalX)
        && (rowO1 || rowO2 || rowO3 || columnO1 || columnO2 || columnO3 || leftDiaganalO || rightDiaganalO)
    ) {
        println("Impossible")
        return
    }

    if (!isFull) {
        if (!(rowX1 || rowX2 || rowX3 || columnX1 || columnX2 || columnX3 || leftDiaganalX || rightDiaganalX)
            && !(rowO1 || rowO2 || rowO3 || columnO1 || columnO2 || columnO3 || leftDiaganalO || rightDiaganalO)
        ) {
            println("Game not finished")
            return
        }
    } else {
        if (!(rowX1 || rowX2 || rowX3 || columnX1 || columnX2 || columnX3 || leftDiaganalX || rightDiaganalX)
            && !(rowO1 || rowO2 || rowO3 || columnO1 || columnO2 || columnO3 || leftDiaganalO || rightDiaganalO)
        ) {
            println("Draw")
            return
        }
    }


    for (x in listOf(rowX1, rowX2, rowX3, columnX1, columnX2, columnX3, leftDiaganalX, rightDiaganalX)) {
        if (x) {
            println("X wins")
            return
        }
    }

    for (O in listOf(rowO1, rowO2 || rowO3, columnO1, columnO2, columnO3, leftDiaganalO, rightDiaganalO)) {
        if (O) {
            println("O wins")
            return
        }
    }



}