fun main(){
  val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
  //val input: Array<Int> = arrayOf<Int>(2,3,1,4)
  //printArray(input)
  QuickSort.sort(input, 0, input.size-1)
  QuickSort.printArray(input)
}
