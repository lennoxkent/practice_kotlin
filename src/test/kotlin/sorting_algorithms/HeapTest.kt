import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class HeapTest {
  @Test
  fun simpleTestCase() {
    val input: Array<Int> = arrayOf<Int>(1,10,4,7,2,5)
    val expected: Array<Int> = arrayOf<Int>(10,7,5,1,2,4)

    Heap.constructHeapBottomUp(input)
    assertArrayEquals(expected, input)
  }
}
