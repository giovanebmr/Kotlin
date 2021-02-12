fun main(){
	
	var mensagem:String? = null


	if( mensagem != null){
		println("Mensagem não é null")
	}else{
		println("Mensagem é null")
	}


	println("${mensagem ?: "Mensagem é null"}")

//Causa erro em tempo de execução
//	println("${mensagem!!}") 






}
