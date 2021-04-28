fun main() {
  var limite = readLine()!!.toInt()
  for (i in 1..limite) {
      val raio = readLine()!!.split(" ").map { it.toInt() }
      println( raio[0] + raio[1] )
  }
}