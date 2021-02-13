package one.digitalinnovation.diobank

class Cliente(
        nome: String,
        cpf: String,
        val clienteTipo: ClienteTipo,
        val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "cliente123" == senha

    override fun toString(): String = """
            Nome: $nome
            CPF: $cpf
            Tipo: ${clienteTipo.descricao}
        """.trimIndent()
}
