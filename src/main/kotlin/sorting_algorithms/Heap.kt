import kotlin.math.floor
import kotlin.Double

class Heap{
  companion object {
    fun constructHeapBottomUp(input: Array<Int>){
      // using n determine if the input array could be a valid heap
      val lastParentIndex: Int = floor(input.size/(2.toDouble())).toInt() -1 // -1: index from 0
      val last: Int = input.size - 1
     
      for(i in lastParentIndex downTo 0 ){
        var k: Int = i 
        val v: Int = input[i]
        var isHeap: Boolean = false
        while(!isHeap && 2*k <= last){
          var j: Int = 2*k 
          if(j < last){
            if (input[j] < input[(j+1)]){
              j = j + 1
            }
            if(v >= input[j]){
              isHeap = true
            }
            else{
              input[k] = input[j]
              k = j
            }
          }
        }
        input[k]=v
      }

      for (element in input) { println(element) }
    }

    fun swap(input: Array<Int>, a: Int, b: Int){
      val temp: Int = input[b]
      input[b] = input[a]
      input[a] = temp
    } 
  }
}
