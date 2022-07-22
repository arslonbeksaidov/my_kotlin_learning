enum class Rainbow(val color: String, val nr: Int) {
    RED("RED", 1),
    ORANGE("ORANGE", 2),
    YELLOW("YELLOW", 3),
    GREEN("GREEN", 4),
    BLUE("BLUE", 5),
    INDIGO("INDIGO", 6),
    VIOLET("VIOLET", 7)
}

enum class Currency(val country: String, val currency: String) {
    Germany("Germany", "Euro"),
    Mali("Mali", "CFA franc"),
    Dominica("Dominica", "Eastern Caribbean dollar"),
    Canada("Canada", "Canadian dollar"),
    Spain("Spain", "Euro"),
    Australia("Australia", "Australian dollar"),
    Brazil("Brazil", "Brazilian real"),
    Senegal("Senegal", "CFA franc"),
    France("France", "Euro"),
    Grenada("Grenada", "Eastern Caribbean dollar"),
    Kiribati("Kiribati", "Australian dollar"),
}


fun main() {
    val inputValue = readln().split(" ")
    try {
        val countryOne = Currency.valueOf(inputValue[0])
        val countryTwo = Currency.valueOf(inputValue[1])
        if (countryOne.currency == countryTwo.currency) println(true) else println(false)
    } catch (e: IllegalArgumentException) {
        println(false)
        return
    }

}