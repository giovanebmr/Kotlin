package one.digitalinnovation.diobank

class Pessoa {

    var nome:String = "Nome da Pessoa"

    var cpf:String = "111.111.111-42"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

    inner class Endereco{
        var rua:String = "Rua da Penha"
    }

}


fun main(){

    val giovane = Pessoa()

    println( giovane.pessoaInfo() )


}