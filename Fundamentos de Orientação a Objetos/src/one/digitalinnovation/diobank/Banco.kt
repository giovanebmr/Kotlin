package one.digitalinnovation.diobank

data class Banco (
    val nome:String,
    val numero:Int
){
    fun info() = "$nome - $numero"
}