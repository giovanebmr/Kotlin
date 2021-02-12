package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.ClienteTipo

fun main(){

    ClienteTipo.values().forEach {
        println("${it.name} ${it.descricao}")
    }

    /*
    ClienteTipo.values().forEach {
        element -> println("${element.name} ${element.descricao}")
    }

     */

    val pf = ClienteTipo.PF
    println("${pf.name} ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} ${pj.descricao}")

}