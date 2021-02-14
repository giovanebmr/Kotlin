fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union( funcionarios2 )

    println( resultUnion )


    println("-------------------------------------------")


    val funcionarios3 = setOf(joao,pedro,maria)
    val resultSubtract = funcionarios3.subtract( funcionarios2)
    println( resultSubtract )

    println("-------------------------------------------")


    val resultIntersect = funcionarios2.intersect( funcionarios3)
    println( resultIntersect )








}