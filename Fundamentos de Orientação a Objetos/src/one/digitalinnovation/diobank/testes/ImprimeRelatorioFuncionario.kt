package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Funcionario

class ImprimeRelatorioFuncionario {

    //companion object: método estático que pode ser invocado via classe, sem necessidade da instância
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }

    }
}