object SingleyLinkedList {
  class Node(val name: String = "default") {
    var next: Node? = null
  }

  class LinkedList(){
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
  }

  fun main(){
    var ll: LinkedList = LinkedList()
    ll.add("apple")
    ll.add("bannana")
    ll.add("carrot")
    ll.printNodes()

    println("removing last node")
    ll.removeLastNode()
    ll.printNodes()
  }
}
