import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class SinglyLinkedListTest {
  @Test
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
}
