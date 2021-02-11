const val SUM = 1;
const val MULT = 2;
const val DIV = 3;
const val SUB = 4;

fun main() {
  
    var a = 10.toFloat()
    var b = 20.toFloat()
    var c = 5
    
    
    println( "Soma de $a por $b = ${ operacoesBasicas(a,b,SUM) }" )
    println( "Multiplicacao de $a por $b = ${ operacoesBasicas(a,b,MULT) }" )
    println( "Divisao de $a por $b = ${ operacoesBasicas(a,b,DIV) }" )
    println( "Subtracao de $a por $b = ${ operacoesBasicas(a,b,SUB) }" ) 
    println( "Fatorial de $c = ${ c.fatorial() }" )
	
}

fun Int.fatorial():Int{
    var resultado:Int = 1
    (resultado..this).toList().forEach{ a -> resultado *= a }
    return resultado
}

fun operacoesBasicas(a:Float, b:Float, operacao:Int):Float{
    var resultado:Float = 0.toFloat()
    when{
        operacao.equals(SUM) -> { resultado = a.plus(b) }
        operacao.equals(MULT) -> { resultado = a.times(b) }
        operacao.equals(DIV) -> { resultado = a.div(b) }
        operacao.equals(SUB) -> { resultado = a.minus(b) }
    }
    return resultado.toFloat()
}

	
