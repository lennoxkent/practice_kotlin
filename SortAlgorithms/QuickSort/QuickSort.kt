class QuickSort{
  companion object {
    fun sort(input: Array<Int>){
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
  val input: Array<Int> = arrayOf<Int>(1,3,4,9,0,6,2)
  printArray(input)
  println("Sorting array")

}
