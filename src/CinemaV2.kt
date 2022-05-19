import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)


    fun showOptions() {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
    }


    fun getPrice(rows: Int, columns: Int, positionRow: Int): Int {
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
        return ticketPrice
    }

    fun showCurrentIncome(
        rows: Int,
        columns: Int,
        boughtTickets: MutableList<MutableList<Int>>
    ): Int {

        var currentIncome = 0
        for (x in boughtTickets) {
            currentIncome += getPrice(rows, columns, x[0])
        }
        return currentIncome
    }

    fun showPrice(rows: Int, columns: Int, positionRow: Int) {
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

    fun showStats(
        rows: Int,
        columns: Int,
        boughtTicketList: MutableList<MutableList<Int>>,
        currentSelectedRowPosition: Int = 0
    ) {
        var totalPrice = 0
        if (rows * columns < 60) {
            totalPrice = rows * columns * 10
        } else {
            val half = rows / 2
            if (rows % 2 == 0) {
                totalPrice = half * columns * (18)
            } else {
                totalPrice = half * 10 * columns + (half + 1) * 8 * columns
            }
        }
        val percentageSum = (boughtTicketList.size * 100).toDouble() / (rows * columns).toDouble()
        val percentage = String.format("%.2f", percentageSum)
        val currenctIncome = showCurrentIncome(rows, columns, boughtTicketList)

        println("Number of purchased tickets: ${boughtTicketList.size}")
        println("Percentage: $percentage%")
        println("Current income: $$currenctIncome")
        println("Total income: $$totalPrice")
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
                    if (boughtTicketList.size > 0) {
                        for (x in boughtTicketList) {
                            if (x[0] == i && x[1] == j) {
                                isset = true
                                break
                            }
                        }
                    }
                    if (isset) {
                        print("B ")
                    } else {
                        print("S ")
                    }

                }

            }
            println()
        }
    }

    fun checkDublicateTicket(boughtTicketList: MutableList<MutableList<Int>>, row: Int, column: Int): Boolean {
        var dublicateTicket = false
        for (x in boughtTicketList) {
            if (x[0] == row && x[1] == column) {
                dublicateTicket = true
                break
            }
        }
        return dublicateTicket
    }

    fun buyTicket(rows: Int, columns: Int, boughtSeatsList: MutableList<MutableList<Int>>) {
        while (true) {
            println("Enter a row number:")
            val row = scanner.nextInt()
            println("Enter a seat number in that row:")
            val column = scanner.nextInt()
            var hasAlreadyBought = true
            if (row > rows || column > columns) {
                println("Wrong input!")
            } else if (checkDublicateTicket(boughtSeatsList, row, column)) {
                println("That ticket has already been purchased!")
            } else {
                showPrice(rows, columns, row)
                boughtSeatsList.add(mutableListOf(row, column))
                break
            }
        }
    }


    fun makeCinemaTheatre() {
        println("Enter the number of rows:")
        val rows = scanner.nextInt()
        println("Enter the number of seats in each row:")
        val columns = scanner.nextInt()
        val boughtSeatsList: MutableList<MutableList<Int>> = mutableListOf()
        while (true) {
            showOptions()
            val optionNumber = scanner.next()
            when (optionNumber) {
                "1" -> showSieats(rows, columns, boughtSeatsList)
                "2" -> buyTicket(rows, columns, boughtSeatsList)
                "3" -> showStats(rows, columns, boughtSeatsList)
                "0" -> break
            }
        }
    }
    makeCinemaTheatre()
}


