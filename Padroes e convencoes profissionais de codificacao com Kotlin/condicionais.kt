fun main(){

	val cor = "branco"

	var mensagem = when(cor){
		"vermelho" -> "Cor do cavalo de Napoleão não é vermelho e sim branco"
		 "azul" -> "Cor do cavalo de Napoleão não é vermelho e sim branco"
		 "branco" -> "Acertou a cor do cavalo branco de Napoleao"
		 else -> "sem cor"
	}

	println(mensagem)

}
