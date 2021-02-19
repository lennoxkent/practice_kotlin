import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions.assertArrayEquals

class QuickSortTest {
  @Test
  fun simpleTestCase() {
    val input: Array<Int> = arrayOf<Int>(6, 3, 17, 11, 4, 44, 76, 23, 12, 30)
    val expected: Array<Int> = arrayOf<Int>(3, 4, 6, 11, 12, 17, 23, 30, 44, 76)

    QuickSort.sort(input, 0, input.size-1)
    assertArrayEquals(expected, input)
  }

  @Test
  fun textBookCase(){
    val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
    val expected: Array<Int> = arrayOf<Int>(1,2,3,4,5,7,8,9)

    QuickSort.sort(input, 0, input.size-1)
    assertArrayEquals(expected, input)
  }
}
