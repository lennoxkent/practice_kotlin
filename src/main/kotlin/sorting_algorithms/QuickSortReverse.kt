// Quick sort, but selecting a left pivot and descending order
class QuickSortReverse {
  companion object{
    fun sort(input: Array<Int>, left: Int, right: Int){
      if(left >= right) return

      var q: Int = findPivot(input, left, right)
      sort(input, left, q-1)
      sort(input, q+1, right)
    }

    fun findPivot(input: Array<Int>, left: Int, right: Int): Int{
      var r: Int = right
      var q: Int = right
      while(r>left){
        if(input[r] < input[left]){
          swap(input, r, q)
          q--
        }
        r--
      }
      swap(input, q, left)
      return q
    }

    fun swap(input: Array<Int>, a: Int, b: Int){
      var temp: Int = input[a]
      input[a] = input[b]
      input[b] = temp
    }
  }
}
