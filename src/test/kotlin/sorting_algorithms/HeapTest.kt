import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class HeapTest {
  @Test
  fun simpleTestCase() {
    val input: Array<Int> = arrayOf<Int>(1,10,4,7,2,4)
    val expected: Array<Int> = arrayOf<Int>(10,5,7,4,2,1)

    Heap.constructHeapBottomUp(input)
    assertArrayEquals(expected, input)
  }
}
