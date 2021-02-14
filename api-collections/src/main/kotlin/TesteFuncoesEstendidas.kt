/*Usando o arquivo BigDecimal.kt
*Funções extendidas
*/

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println( salarios.somatoria() )

    println("----------------------------------")

    println( salarios.media() )

    println(  salarios.any { it > "1500".toBigDecimal() })
    println( salarios.filter { it > "1500".toBigDecimal() })


}