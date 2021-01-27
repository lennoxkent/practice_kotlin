class QuickSort{
  companion object {
    @JvmStatic
    fun main(args : Array<String>) {
      println("HELLO THERE");
    }

    fun sort(input: Array<Int>, left: Int, right: Int){
      if(left < right){
        val pivot = splitPartition(input, left, right)
        println("pivot value: " +  input[pivot])
        sort(input, left, pivot-1)
        sort(input, pivot+1, right)
      }
    }
    fun splitPartition(input: Array<Int>, left: Int, right: Int): Int{
      println("--------------")
      printArray(input)
      println("left: " + left.toString())
      println("right: " + right.toString())
      var pivotValue = input[left]
      var l: Int = left
      var r: Int = right
      println("l before: " + l.toString())
      println("r before: " + r.toString())
      while(l<r){
        println("While ====")
        printArray(input)
        println("l: " + l.toString())
        println("r: " + r.toString())
        while(input[l] < pivotValue) l++ 
        while(input[r] > pivotValue) r--
        switch(input, l, r)
      }
      if (l<r){
        switch(input, l, r)
        switch(input, left, r)
        println("--------------")
      }
      return r
    }
    fun switch(input: Array<Int>, a: Int, b: Int){
      val temp: Int = input[b]
      input[b] = input[a]
      input[a] = temp
    }

    fun printArray(input: Array<Int>){
      for(i in input.indices){
        val displayValue: String = input[i].toString() + " "
        print(displayValue)
      }
      println()
    }

    //public static void fun main(){
      //  val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
      //  //val input: Array<Int> = arrayOf<Int>(2,3,1,4)
      //  //printArray(input)
      //  QuickSort.sort(input, 0, input.size-1)
      //  QuickSort.printArray(input)
      //}
  }
}
