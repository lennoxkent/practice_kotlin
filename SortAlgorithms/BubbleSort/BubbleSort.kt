class BubbleSort{
  companion object {
    fun sort(input: Array<String>){
      var last: Int = input.size-1
      for(i in 0..last){
        for(j in 0..last-i-1){
          var a: String = input[j]
          var b: String = input[j+1]
          if(a > b){
            var temp: String = b
            input[j+1] = a
            input[j] = temp
          }
        }
      }
    }
    fun printStringArray(stringArray: Array<String>){
      if(stringArray.size == 0) return
      for(i in stringArray.indices){
        println(stringArray[i])
      }
    }
  }
}

fun main(){
 val strings = arrayOf("v", "b", "c", "z", "a", "d")
 BubbleSort.sort(strings)
 BubbleSort.printStringArray(strings)
}
