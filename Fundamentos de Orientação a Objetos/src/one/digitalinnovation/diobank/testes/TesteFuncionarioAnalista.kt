package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Analista
import one.digitalinnovation.diobank.Funcionario
import one.digitalinnovation.diobank.Pessoa
import java.math.BigDecimal


fun main(){

    val joao = Analista(nome="João", cpf="444.666.444-65", salario= 3000.toDouble() )

    ImprimeRelatorioFuncionario.imprime(joao)


}


