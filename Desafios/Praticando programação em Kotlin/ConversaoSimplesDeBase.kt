/*Código com pequenas adaptações
Crédito de resolução deste desafio para Ana Guerra
Referência: https://github.com/GuerraAna/DesafiosBootcampEverisDIO/blob/master/src/main/kotlin/DesafioConversaoSimplesDeBase.kt */

fun main() {
    
    val hexadecimal = """0[a-zA-Z].*""".toRegex()
    val decimal = """[a-zA-Z].*""".toRegex()
    var value = true

    while(value) {
        val read = readLine()!!.toString()

        if (!read.contains(hexadecimal) && read.toInt() > 0 && read.toInt() < Integer.MAX_VALUE) {
            val n = read.toInt()
            val decimal = Integer.toHexString(n).toUpperCase()
            val decimalC = "0x$decimal"
            println( decimalC )
        }
        
        if(read == "-1"){
            value = false
        }

        if (read.contains(hexadecimal) && read.contains(decimal)) {
            val remove = read.removeRange(0,2)
            val result:Int = remove.toInt(16)
            println( result.toString() )
        }
    }
}