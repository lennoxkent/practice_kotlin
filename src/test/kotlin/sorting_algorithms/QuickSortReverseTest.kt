import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class QuickSortReverseTest {
  @Test
  fun simpleTestCase() {
    val input: Array<Int> = arrayOf<Int>(6, 3, 17, 11, 4, 44, 76, 23, 12, 30)
    val expected: Array<Int> = arrayOf<Int>(76, 44, 30, 23, 17, 12, 11, 6, 4, 3)

    QuickSortReverse.sort(input, 0, input.size-1)
    assertArrayEquals(expected, input)
  }

  @Test
  fun textBookCase(){
    val input: Array<Int> = arrayOf<Int>(5, 3, 1, 9, 8, 2, 4, 7)
    val expected: Array<Int> = arrayOf<Int>(9, 8, 7, 5, 4, 3, 2, 1)

    QuickSortReverse.sort(input, 0, input.size-1)
    assertArrayEquals(expected, input)
  }
}
