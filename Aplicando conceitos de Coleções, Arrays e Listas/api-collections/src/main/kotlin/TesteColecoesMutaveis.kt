fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("-------mutableListOf: Pode ser feito alterações ---------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------------------------------------")
    funcionarios.remove(joao)

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("------------------------------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}