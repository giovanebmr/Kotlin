import kotlin.math.sqrt

fun main(args: Array<String>) {

    var limite  = readLine()!!.toInt()

    for (i in 0 until limite) {

        var input = readLine()!!.toDouble()
        
        if ( isPrimo(input) ) {
            println("Prime")
        }else {
            println("Not Prime")
        }
    }
}

fun isPrimo(numero: Double): Boolean {
    var limite: Int = (sqrt(numero)).toInt()
    for (j in 2..limite) {
        if (numero % j == 0.0) {
            return false
        }
    }
    return true
}