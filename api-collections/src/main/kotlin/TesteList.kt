fun main(){
    val joao = Funcionario("Joao",3000.0, "CLT")
    val maria = Funcionario("Maria",2000.0, "CLT")
    val pedro = Funcionario("Pedro",4000.0, "PJ")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println(it) }

    println("--------------- Encontra funcionario maria -----------------")
    println( funcionarios.find { it.nome.equals("Maria") } )

    println("--------------Ordena pelo salário-------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("--------------Ordena pelo grupo tipo de contratação-------------------")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }


}


