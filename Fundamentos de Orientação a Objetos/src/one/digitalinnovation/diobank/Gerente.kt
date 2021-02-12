package one.digitalinnovation.diobank

class Gerente(
        nome:String,
        cpf:String,
        salario:Double
):Funcionario(  nome=nome, cpf=cpf, salario = salario ) {
    override fun calculoAuxilio() = salario * 0.4
}