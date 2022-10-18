import kotlin.math.floor

class Heap{
  companion object {
    fun constructHeapBottomUp(input :Array<Int>){
      // Using n determine if the input array could be a valid heap
      val n :Int = input.size
      val lastParentIndex: Int = floor(n/(2.toDouble())).toInt() -1 // -1: index from 0

      // Check if each of the parents is a heap.
      // Starting from the last parent to the root, ie bottom-up approach.
      for(i in lastParentIndex downTo 0 ){
        var k :Int = i
        val v :Int = input[k]
        var isHeap :Boolean = false

        while(isHeap.equals(false) && 2*k < n){
          var j :Int = 2*k
          if (j + 1 < n && input[j+1] > input[j])  j = j + 1
          if (v > input[j]) {
            isHeap = true
          }
          else {
            input[k] = input[j]
            k = j
          }
          input[k] = v
        }
      }
    }
    fun swap(a :Int, b :Int, input :Array<Int>){
      val temp :Int = input[a]
      input[a] = input[b]
      input[b] = temp
    }

  }
}
