import java.util.Scanner

fun main(args: Array<String>) {
    
    val input = Scanner(System.`in`)
    val limite = input.nextInt()
    var x = 0
    
    while ( x < limite ) {
        val numero = input.nextInt()
        primo(numero)
        x++
    }
    
}

fun primo(num:Int) {
    var i = 1
    var qtdDivisores = 0;

    while( i <= num ) {
        if (divisaoExata(num, i)) {
            qtdDivisores++
        }
        i++
    }

    if (qtdDivisores == 2) {
         print("Prime\n")
    } else {
         print("Not Prime\n")
    }
}

fun divisaoExata(dividendo:Int, divisor:Int):Boolean  {
    return (dividendo % divisor) == 0
}