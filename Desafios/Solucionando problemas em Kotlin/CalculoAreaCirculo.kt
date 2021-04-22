import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val raio = input.nextDouble()
    val pi = 3.14159
    val area = pi * raio * raio
    val resultado = BigDecimal(  area  ).setScale(4, RoundingMode.HALF_EVEN)
    println("A=$resultado\n")
}