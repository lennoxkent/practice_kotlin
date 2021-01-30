object DoublyLinkedList {
  class Node(var name: String){
    var previousNode: Node? = null
    var nextNode: Node? = null
  }

  class DoublyLinkedList(){
    var start: Node? = null
    var end: Node? = null

    fun add(name: String){
      addNode(Node(name))
    }

    fun addNode(newNode: Node){
      if(start == null){
        start = newNode
        end = newNode
      }
      else{
        joinNodes(end, newNode)
        end = newNode
      }
    }

    private fun joinNodes(nodeA: Node?, nodeB: Node?){
      nodeA?.nextNode = nodeB
      nodeB?.previousNode = nodeA
    }

    private fun severNodes(nodeA: Node?, nodeB: Node?){
      nodeA?.nextNode = null
      nodeB?.previousNode = null
    }

    fun printNodeNames(){
      var current: Node? = start
      while(current != null){
        println(current.name)
        current = current.nextNode
      }
    }

    fun printReverseNodeNames(){
      var current: Node? = end
      while(current != null){
        println(current.name)
        current = current.previousNode
      }
    }

    fun deleteLastNode(){
      if(start == null) return
      if(start == end){
        start = null
        end = null
      }
      else{
        var tempNode: Node? = end?.previousNode
        severNodes(end?.previousNode, end)
        end = tempNode
      }
    }

    fun deleteFirstNode(){
      if(start == null) return
      if(start == end){
        start = null
        end = null
      }
      else{
        var tempNode: Node? = start?.nextNode
        severNodes(start, start?.nextNode)
        start = tempNode
      }
    }
  }
}
