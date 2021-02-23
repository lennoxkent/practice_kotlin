import org.junit.jupiter.api.Test

class DoublyLinkedListTest {
  @Test
  fun addNodesTest(){
    var dll: DoublyLinkedList.DoublyLinkedList = DoublyLinkedList.DoublyLinkedList()
    dll.add("apple")
    dll.add("bannana")
    dll.add("carrot")

    val expected: Array<String> = arrayOf<String>("apple", "bannana", "carrot")
    DoublyLinkedList.DoublyLinkedList.assert(expected, dll)
  }

  @Test
  fun deleteLastNodeTest(){
    var dll: DoublyLinkedList.DoublyLinkedList = DoublyLinkedList.DoublyLinkedList()
    dll.add("apple")
    dll.add("bannana")
    dll.add("carrot")
    dll.deleteLastNode()

    val expected: Array<String> = arrayOf<String>("apple", "bannana")
    DoublyLinkedList.DoublyLinkedList.assert(expected, dll)
  }

  @Test
  fun deleteNodeTest(){
    var dll: DoublyLinkedList.DoublyLinkedList = DoublyLinkedList.DoublyLinkedList()
    dll.add("apple")
    dll.add("bannana")
    dll.add("carrot")
    dll.deleteFirstNode()

    val expected: Array<String> = arrayOf<String>("bannana", "carrot")
    DoublyLinkedList.DoublyLinkedList.assert(expected, dll)
  }
}
