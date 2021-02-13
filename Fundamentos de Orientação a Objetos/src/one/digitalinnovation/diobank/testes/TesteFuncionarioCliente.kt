package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.*
import java.math.BigDecimal


fun main(){

    val Ana = Cliente(nome="Ana", cpf="444.666.444-65", clienteTipo =ClienteTipo.PF, senha="cliente123" )

    println(Ana)

    TesteAutenticacao().autentica(Ana)


}


