import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows

class HeapTest {
  @Test
  fun `happy path`() {
    val input: Array<Int> = arrayOf<Int>(1,10,4,7,2,5)
    val expected: Array<Int> = arrayOf<Int>(10,7,5,1,2,4)

    Heap.constructHeapBottomUp(input)
    assertArrayEquals(expected, input)
  }

  @Test
  fun `isEssentiallyCompleteHeap`(){
    // 5 elements results in false
    val tooSmall: Array<Int> = arrayOf<Int>(1,2,3,4,5)
    assertEquals(Heap.isEssentiallyCompleteHeap(tooSmall), false)

    // 6 elements results in true
    val essentiallyComplete: Array<Int> = arrayOf<Int>(1,2,3,4,5,6)
    assertEquals(Heap.isEssentiallyCompleteHeap(essentiallyComplete), true)

    // 7 elements results in true (a complete heap is essentially complete)
    val complete: Array<Int> = arrayOf<Int>(1,2,3,4,5,6,7)
    assertEquals(Heap.isEssentiallyCompleteHeap(complete), true)

    // 8 elements results in false
    val tooLarge: Array<Int> = arrayOf<Int>(1,2,3,4,5,6,7,8)
    assertEquals(Heap.isEssentiallyCompleteHeap(tooLarge), false)

    // Construct bottom up method throws exception when heap not essentially complete
    assertThrows(IllegalArgumentException::class.java){
      Heap.constructHeapBottomUp(tooLarge)
    }
  }
}
