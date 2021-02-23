import org.junit.jupiter.api.Test

class SinglyLinkedListTest {
  fun simple_test(){
    var ll: SinglyLinkedList.List = SinglyLinkedList.List()
    ll.add("apple")
    ll.add("bannana")
    ll.add("carrot")
    ll.printNodes()

    println("removing last node")
    ll.removeLastNode()
    ll.printNodes()
  }

  @Test
  fun addNodesTest(){
    var sll: SinglyLinkedList.List = SinglyLinkedList.List()
    sll.add("apple")
    sll.add("bannana")
    sll.add("carrot")
    
    val expected: Array<String> = arrayOf("apple", "bannana", "carrot")
    SinglyLinkedList.List.assert(expected, sll)
  }

  @Test
  fun removeLastNodeTest(){
    var sll: SinglyLinkedList.List = SinglyLinkedList.List()
    sll.add("apple")
    sll.add("bannana")
    sll.add("carrot")
    sll.removeLastNode()
    
    val expected: Array<String> = arrayOf("apple", "bannana")
    SinglyLinkedList.List.assert(expected, sll)
  }
}
