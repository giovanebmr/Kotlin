package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Analista
import one.digitalinnovation.diobank.Funcionario
import one.digitalinnovation.diobank.Gerente
import one.digitalinnovation.diobank.Pessoa
import java.math.BigDecimal


fun main(){

    val maria = Gerente(nome="Maria do Carmo", cpf="444.666.444-65", salario= 5000.toDouble(),senha="123456" )

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}



