import kotlin.math.floor
import kotlin.math.log2
import kotlin.math.ceil

class Heap{
  companion object {
    fun constructHeapBottomUp(input :Array<Int>){
      if (!isEssentiallyCompleteHeap(input)) throw IllegalArgumentException("Heap not essentially complete")

      val n :Int = input.size
      val lastParentIndex: Int = floor(n/(2.toDouble())).toInt() -1 // -1: index from 0

      // Check if each of the parents is a heap.
      // Starting from the last parent to the root, ie bottom-up approach.
      for(i in lastParentIndex downTo 0 ){
        var currentParent :Int = i
        val v :Int = input[currentParent]
        var isHeap :Boolean = false

        while(isHeap.equals(false) && 2*currentParent < n){
          var childIndex :Int = 2*currentParent
          if (childIndex + 1 < n && input[childIndex+1] > input[childIndex])  childIndex = childIndex + 1
          if (v > input[childIndex]) {
            isHeap = true
          }
          else {
            input[currentParent] = input[childIndex]
            currentParent = childIndex
          }
          input[currentParent] = v
        }
      }
    }

    fun isEssentiallyCompleteHeap(input: Array<Int>): Boolean {
      val complete = log2((input.size + 1).toDouble())
      val essentiallyComplete =  log2((input.size + 2).toDouble())
      return ceil(complete) == floor(complete) || ceil(essentiallyComplete) == floor(essentiallyComplete)
    }
  }
}

