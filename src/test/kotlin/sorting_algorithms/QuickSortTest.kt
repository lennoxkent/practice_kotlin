import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class QuickSortTest {
    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAllTestCases() {
            println("Runs once before all test cases.")
        }

        @AfterAll
        @JvmStatic
        fun afterAllTestCases() {
            println("Runs once after all test cases.")
        }
    }

    @Test
    fun simpleTestCase() {
        println("A simple test case.")

        val input: Array<Int> = arrayOf<Int>(5,3,1,9,8,2,4,7)
        //val input: Array<Int> = arrayOf<Int>(2,3,1,4)
      //  QuickSort.sort(input, 0, input.size-1)
      //  QuickSort.printArray(input)
      // assertEquals(2, numberTwo)
    }
}
