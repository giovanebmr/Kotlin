fun main(){

    val values = IntArray(5)

    values[0] = 1
    values[1] = 3
    values[2] = 5
    values[3] = 8
    values[4] = 2

    for ( valor in values){
        println("1º - $valor")
    }

    values.forEach {
        println("2º - $it")
    }

    for( index in values.indices ){
        println("3º - ${values[index]}")
    }

    values.sorted().forEach {
        println("4º - Ordenado: ${it}")
    }

}