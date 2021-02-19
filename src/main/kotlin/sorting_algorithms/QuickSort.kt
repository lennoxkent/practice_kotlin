// Taken from
// https://hackernoon.com/algorithms-explained-quicksort-324305b8757b

class QuickSort{
  companion object {

    fun sort(input: Array<Int>, left: Int, right: Int){
      if(left < right){
        var p: Int = findPivot(input, left, right)
        sort(input, left, p-1)
        sort(input, p+1, right)
      }
    }

    // q is where we are going to place the pivot value (input[right])
    fun findPivot(input: Array<Int>, left: Int, right: Int): Int{
      var l: Int = left 
      var q: Int = left 

      while(l<right){
        if(input[l] < input[right]){
          swap(input, q, l)
          q++
        }
        l++
      }
      swap(input, q, right)

      return q;
    }

    fun swap(input: Array<Int>, a: Int, b: Int){
      var temp: Int = input[b]
      input[b] = input[a]
      input[a] = temp
    }
  }
}
