fun main(){

    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    nomes.forEach {
        println("$it")
    }

    nomes.sort()

    nomes.forEach { println(it) }



    val nomes2 = arrayOf("Maria", "João", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }




}