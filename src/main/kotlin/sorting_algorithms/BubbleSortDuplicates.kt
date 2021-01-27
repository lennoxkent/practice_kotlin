class Fruit(var name: String, var size: Int){}

class BubbleSortDuplicates{
  companion object {
    fun sortBySize(input: Array<Fruit>){
      for(i in input.indices){
        for(j in 0..input.size-2-i){
          val fruitA: Fruit = input[j]
          val fruitB: Fruit = input[j+1]
          if(fruitA.size > fruitB.size){
            input[j] = fruitB
            input[j+1] = fruitA
          }
        }
      }
    }
  }
}

fun printArray(input: Array<Fruit>){
  for(i in input.indices){
    val output: String = input[i].name + " " + input[i].size
    println(output)
  }
}

fun main(){
  // Apple and pear have the same size so we should see the order preserved in the output. Ie apple then pear
  val input = arrayOf<Fruit>(Fruit("apple", 3), Fruit("pear", 3), Fruit("watermellon", 4), Fruit("plumb", 1))
  printArray(input)
  println("Sorting the array now ========")
  BubbleSortDuplicates.sortBySize(input)
  printArray(input)
}

