class QuickSort{
  companion object {
    fun sort(input: Array<Int>, left: Int, right: Int){
      if(left < right){
        val pivot = splitPartition(input, left, right)
        sort(input, left, pivot-1)
        sort(input, pivot+1, right)
      }
    }
    fun splitPartition(input: Array<Int>, left: Int, right: Int): Int{
      var pivotValue = input[left]
      var l: Int = left+1
      var r: Int = right
      while(l<r){
        while(input[l] < pivotValue) l++ 
        while(input[r] > pivotValue) r--
        switch(input, l, r)
      }
      switch(input, l, r)
      switch(input, left, r)
      return r
    }
    fun switch(input: Array<Int>, a: Int, b: Int){
      val temp: Int = input[b]
      input[b] = input[a]
      input[a] = temp
    }
  }
}

fun printArray(input: Array<Int>){
  for(i in input.indices){
    val displayValue: String = input[i].toString() + " "
    print(displayValue)
  }
  println()
}

fun main(){
  val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
  printArray(input)
  QuickSort.sort(input, 0, input.size-1)
  printArray(input)
}
