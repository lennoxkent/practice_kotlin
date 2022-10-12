object SinglyLinkedList {
  class Node(val name: String = "default") {
    var next: Node? = null
  }

  class List(){
    var start: Node? = null
    var head: Node? = null

    fun addNode(newNode: Node?){
      if(start == null){ start = newNode }

      if(head == null){ 
        head = newNode
      }
      else{
        head?.next = newNode
        head = newNode
      }
    }

    fun add(name: String){
      var node: Node = Node(name)
      addNode(node)
    }

    fun printNodes(){
      var current: Node? = start
      while(current != null){
        println(current.name)
        current = current.next
      } 
    }

    fun removeLastNode(){
      if(start == null) return

      var current: Node? = start
      var previous: Node? = null
      while(current != head){
        previous = current
        current = current?.next
      }
      previous?.next = null
    }

    companion object{
      fun assert(expected: Array<String>, real: List){
        var current: Node? = real.start
        for(v in expected){
          if(current == null){
            throw Exception("Missmatch between expected and real")
          }
          else if(current.name != v){
            throw Exception("Missmatch. Expected: $v, got $current.name")
          }
          else{
            current = current.next
          }
        }
      }
    }
  }
}
