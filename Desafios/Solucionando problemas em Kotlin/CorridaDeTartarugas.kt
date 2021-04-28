import java.io.EOFException
import kotlin.KotlinNullPointerException
fun main(args: Array<String>) {
            
    var n:Int
    
    while( true ){
          try{
                  var max:Int = 0
                  var limite = readLine()!!.toInt()
                  val v: List<String>? = readLine()!!.split(" ")
                  for( y in 0..(limite-1)  ){
                   if(v != null){
                         if(  max < v[y].toInt() ){
                              max = v[y].toInt()
                         }
                      }
                  }
                  
                  when ( max ) {
                      in 0..9 -> n = 1
                      in 10..19 -> n = 2
                      else -> n = 3
                  }
                  
                  print("$n\n")
                  
              } catch (f : EOFException ) {
                  break
              } catch (k : KotlinNullPointerException ) {
                  break
              } 
        
    }
}