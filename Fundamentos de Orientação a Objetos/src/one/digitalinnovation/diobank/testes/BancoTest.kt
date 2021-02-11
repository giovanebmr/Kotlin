package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Banco

fun main(){

    val dioBank = Banco( nome ="Bradesco Matriz", numero = 237 )

    val banco2 = dioBank.copy( nome = "Bradesco Palmas")

    println( dioBank.info() )
    println( banco2.info() )

}