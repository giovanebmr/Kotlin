fun main(){

	//mutableLista permite adicionar e remover objetos da lista
	val listaDeFrutas = mutableListOf("Banana","Laranja")

	println("Laranja = ${listaDeFrutas[1]}")
	
	println("Banana = ${listaDeFrutas[0]}")

	listaDeFrutas.add("Limão")

	listaDeFrutas.add(0,"Tomate")

	println("${listaDeFrutas}")

}
