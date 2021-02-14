fun main(){

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for( salario in salarios ){
        println( salario )
    }

    println("---------------------------------------------")

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("---------------------------------------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    salarioMaiorQue2500.forEach { println(it) }

    println("---------------------------------------------")

    println( " Quantidade de salários na faixa de 2 a 5 mil: ${ salarios.count{ it in 2000.0..5000.0 } }")

    println("---------------------------------------------")

    println( "Salários igual a 2250: ${salarios.find { it == 2250.0 } }")
    println( "Salários igual a 50: ${salarios.find { it == 50.0 } }")


    println("---------------------------------------------")

    println( "Qualquer um conforme a condição: ${salarios.any{ it == 1000.0 } }")
    println( "Qualquer um conforme a condição: ${salarios.any{ it == 500.0 } }")






}