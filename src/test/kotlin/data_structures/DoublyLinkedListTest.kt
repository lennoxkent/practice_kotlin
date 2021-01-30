import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class DoublyLinkedListTest {
  @Test
  fun simple_test(){
    var dll: DoublyLinkedList.DoublyLinkedList = DoublyLinkedList.DoublyLinkedList()
    dll.add("apple")
    dll.add("bannana")
    dll.add("carrot")
    dll.printNodeNames()

    println("Print Reverse order of Nodes")
    dll.printReverseNodeNames()

    println("Delete Last Node")
    dll.deleteLastNode()
    dll.printNodeNames()

    println("Delete first Node")
    dll.deleteFirstNode();
    dll.printNodeNames()
  }
}
