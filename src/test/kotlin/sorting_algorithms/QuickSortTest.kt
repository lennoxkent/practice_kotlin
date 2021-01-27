import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class QuickSortTest {
  @Test
  fun simpleTestCase() {
    val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
    val expected: Array<Int> = arrayOf<Int>(1,2,3,4,5,7,8,9)
    
    QuickSort.sort(input, 0, input.size-1)
    assertArrayEquals(expected, input)
  }
}
