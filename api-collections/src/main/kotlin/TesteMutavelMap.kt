

fun main(){
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("----------------------------------------")

    repositorio.findAll().forEach { println(it) }

    println("----------------------------------------")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}