/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

 
Exemplo de Entrada	Exemplo de Saída
8

1
3
5
7
*/



import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val x = input.nextInt()
    
    (1..x).toList().forEach{
      num -> if ( !( (num%2).equals(0) ) ){
                println(num)
            }
    }
    
}
