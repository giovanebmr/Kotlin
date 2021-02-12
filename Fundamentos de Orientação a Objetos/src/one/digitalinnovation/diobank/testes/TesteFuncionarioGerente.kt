package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Analista
import one.digitalinnovation.diobank.Funcionario
import one.digitalinnovation.diobank.Pessoa
import java.math.BigDecimal


fun main(){

    val maria = Analista(nome="Maria do Carmo", cpf="444.666.444-65", salario= 5000.toDouble() )

    ImprimeRelatorioFuncionario.imprime(maria)


}



