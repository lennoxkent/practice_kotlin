import kotlin.math.floor
import kotlin.Double

class Heap{
  companion object {
    fun constructHeapBottomUp(input: Array<Int>){
      val lastParentIndex: Int = floor(input.size/(2.toDouble())).toInt() -1 // -1: index from 0
      val n: Int = input.size

      for(i in lastParentIndex downTo 0 ){
        val li: Int = 2*i + 1
        val ri: Int = li + 1
        if(li < n && input[li] > input[i]) swap(input, li, i)
        if(ri < n && input[ri] > input[i]) swap(input, ri, i)
      }
    }

    fun swap(input: Array<Int>, a: Int, b: Int){
      val temp: Int = input[b]
      input[b] = input[a]
      input[a] = temp
    } 
  }
}
