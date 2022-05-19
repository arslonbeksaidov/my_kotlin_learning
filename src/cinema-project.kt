import java.util.Scanner
import kotlin.math.*
// by MurDavron and Arslon
fun main() {

    val scanner = Scanner(System.`in`)

    fun makeSiets() {
        println("Cinema:")
        for (i in 0..7) {
            if (i == 0) {
                println(" 1 2 3 4 5 6 7 8")
            } else {
                println("$i S S S S S S S S")
            }
        }
    }

    fun makeSiets2() {
        println("Cinema:")
        for (i in 0..7) {
            for (j in 0..8) {
                if (i == 0) {
                    if (j == 0) print("  ") else print("$j ")
                } else if (j == 0) {
                    print("$i ")
                } else {
                    print("S ")
                }
            }
            println()
        }
    }

    fun calculateProfit() {
        println("Enter the number of rows:")
        val rows = scanner.nextInt()
        println("Enter the number of seats in each row:")
        val seats_each_row = scanner.nextInt()
        var profit = 0
        if (rows * seats_each_row < 60) {
            profit = rows * seats_each_row * 10
        } else {
            if (rows % 2 == 0) {
                val half = rows / 2
                profit = seats_each_row * half * 8 + seats_each_row * half * 10
            } else {
                val half = rows / 2
                println(half)
                println(half + 1)
                profit = seats_each_row * 10 * half + seats_each_row * 8 * (half + 1)
            }
        }
        println("Total income:")
        println("$$profit")
    }

    //    calculateProfit()
    fun makeSiets3() {
        println("Enter the number of rows:")
        val rows = scanner.nextInt()
        println("Enter the number of seats in each row:")
        val columns = scanner.nextInt()
        println("Cinema:")
        for (i in 0..rows) {
            for (j in 0..columns) {
                if (i == 0) {
                    if (j == 0) print("  ") else print("$j ")
                } else if (j == 0) {
                    print("$i ")
                } else {
                    print("S ")
                }
            }
            println()
        }
        println("Enter a row number:")
        val positionRow = scanner.nextInt()
        println("Enter a seat number in that row:")
        val positionColumn = scanner.nextInt()
        var ticketPrice = 0
        if (rows * columns < 60) {
            ticketPrice = 10
        } else {
            if (rows % 2 == 0) {
                val half = rows / 2
                ticketPrice = if (positionRow <= half) 10 else 8
            } else {
                val half = rows / 2
                ticketPrice = if (positionRow <= half) 10 else 8
            }
        }
        println("Ticket price: $${ticketPrice}")
        println("Cinema:")
        for (i in 0..rows) {
            for (j in 0..columns) {
                if (i == 0) {
                    if (j == 0) print("  ") else print("$j ")
                } else if (j == 0) {
                    print("$i ")

                } else if (i == positionRow && j == positionColumn) {
                    print("B ")
                } else {
                    print("S ")
                }
            }
            println()
        }

    }
//    makeSiets3()
//----------------------------------------------  final stage of project cinema

    fun showOptions() {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")
    }

    fun showPrice(rows:Int,columns:Int,positionRow:Int){
        var ticketPrice = 0
        if (rows * columns < 60) {
            ticketPrice = 10
        } else {
            if (rows % 2 == 0) {
                val half = rows / 2
                ticketPrice = if (positionRow <= half) 10 else 8
            } else {
                val half = rows / 2
                ticketPrice = if (positionRow <= half) 10 else 8
            }
        }
        println("Ticket price: $${ticketPrice}")
    }

    fun showSieats(row: Int, column: Int, boughtTicketList: MutableList<MutableList<Int>>) {
        println("Cinema:")
        for (i in 0..row) {
            for (j in 0..column) {

                if (i == 0) {
                    if (j == 0) print("  ") else print("$j ")
                } else if (j == 0) {
                    print("$i ")
                } else {
                    var isset = false
                    if (boughtTicketList.size > 0){
                        for (x in boughtTicketList){
                         if (x[0]==i && x[1]==j){
                          isset = true
                             break
                         }
                        }
                    }
                    if (isset){
                        print("B ")
                    }else{
                        print("S ")
                    }

                }

            }
            println()
        }
    }


    fun makeCinemaTheatre() {
        println("Enter the number of rows:")
        val rows = scanner.nextInt()
        println("Enter the number of seats in each row:")
        val columns = scanner.nextInt()
        val boughtSeatsList:MutableList<MutableList<Int>> = mutableListOf()
        while (true){
            showOptions()
            val optionNumber = scanner.next()
            when(optionNumber){
                "1"-> showSieats(rows,columns,boughtSeatsList)
                "2"->{
                    println("Enter a row number:")
                    val row = scanner.nextInt()
                    println("Enter a seat number in that row:")
                    val column = scanner.nextInt()
                    showPrice(rows,columns,row)
                    boughtSeatsList.add(mutableListOf(row,column))
                }
                "0"->break
            }
        }
    }
    makeCinemaTheatre()


}