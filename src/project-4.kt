package converter

import java.math.BigInteger
import java.util.*

object Main {
    private const val DIGITS = "0123456789abcdefghijklmnopqrstuvwxyz"
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        while (true) {
            print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ")
            val params = scanner.nextLine().split(" ".toRegex()).toTypedArray()
            if ("/exit".equals(params[0], ignoreCase = true)) {
                return
            }
            val base = Arrays.stream(params).mapToInt { s: String -> s.toInt() }.toArray()
            while (true) {
                System.out.printf(
                    "Enter number in base %d to convert to base %d (To go back type /back) ",
                    base[0], base[1]
                )
                val number = scanner.nextLine()
                if ("/back".equals(number, ignoreCase = true)) {
                    break
                }
                println("Conversion result: " + fromToRadix(number, base[0], base[1]))
            }
        }
    }

    fun fromToRadix(number: String, sourceBase: Int, targetBase: Int): String {
        val dotIndex = number.indexOf('.')
        if (dotIndex == -1) {
            return BigInteger(number, sourceBase).toString(targetBase)
        }
        val sourceWhole = number.substring(0, dotIndex)
        val sourceFraction = number.substring(1 + dotIndex)
        val targetWhole = BigInteger(sourceWhole, sourceBase).toString(targetBase)
        var decimalFraction = 0.0
        var divider = sourceBase.toDouble()
        for (digit in sourceFraction.toCharArray()) {
            decimalFraction += DIGITS.indexOf(digit) / divider
            divider *= sourceBase.toDouble()
        }
        val targetFraction = StringBuilder()
        for (i in 5 downTo 1) {
            decimalFraction *= targetBase.toDouble()
            val index = decimalFraction.toInt()
            targetFraction.append(DIGITS[index])
            decimalFraction -= index.toDouble()
        }
        val ans = String.format("%.5f",targetFraction)
        return "$targetWhole.$ans"
    }
}