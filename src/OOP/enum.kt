package OOP

import java.util.*

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }

}
fun findByRgb(rgb: String): Rainbow {
    for (enum in Rainbow.values()) {
        if (rgb == enum.rgb) return enum
    }
    return Rainbow.NULL
}

enum class Status {
    OPEN, PENDING, IN_PROGRESS, RESOLVED, REJECTED, CLOSED
}

fun main() {
    val color = Rainbow.RED.color
    val rgb = Rainbow.BLUE.rgb
    val fullInfo = Rainbow.RED.printFullInfo()
    val orderRed = Rainbow.VIOLET.ordinal
    println(orderRed)
    fun isRainbow(color: String): Boolean {
        for (enum in Rainbow.values()) {
            if (color.uppercase() == enum.name) return true
        }
        return false
    }
    println(findByRgb("#8B00FF"))
//    println(isRainbow("black"))
//    println(Rainbow.valueOf("RED"))

}