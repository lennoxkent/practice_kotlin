import kotlin.math.floor
import kotlin.Double

class Heap{
  companion object {
    fun constructHeapBottomUp(input: Array<Int>){
      // Using n determine if the input array could be a valid heap
      val lastParentIndex: Int = floor(input.size/(2.toDouble())).toInt() -1 // -1: index from 0
      val last: Int = input.size - 1
     
      // Check if each of the parents is a heap.
      // Starting from the last parent to the root,ie bottom-up approach.
      for(p in lastParentIndex downTo 0 ){
        var currentParent: Int = p
        val currentParentValue: Int = input[p]
        var isHeap: Boolean = false
        // Check if each of the parents' children is a heap as well.
        while(!isHeap && 2*currentParent <= last){
          var currentChild: Int = 2*currentParent
          // Determine which of it's children values to compare to the parent value.
          if(currentChild < last){
            if (input[currentChild] < input[(currentChild +1)]){
              currentChild = currentChild + 1
            }
            if(currentParentValue >= input[currentChild]){
              isHeap = true
            }
            else{
              input[currentParent] = input[currentChild]
              currentParent = currentChild
            }
          }
        }
        input[currentParent] = currentParentValue
      }
    }
  }
}
