//Limpando a tela do console
//referencia: https://www.javatpoint.com/how-to-clear-screen-in-java

fun main(){

	for( i in 0..100 step 1 ){
		println("......")
		println("......")
		println("......")
		
		//windows
		ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
		//linux
		print("\u001b[H\u001b[2J")		

	}


}
