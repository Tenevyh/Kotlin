import org.junit.Assert.assertEquals
import org.junit.Test
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec



class Totaller(var total: Int = 0) {
    fun add(num: Int): Int {
        total+=num
        return total
    }
}

/*class TotallerTest {
    @Test
    fun `shold Be Able To Add 3 And 4`(){
        val totaller = Totaller()
        
        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }
}

 */

class AnotherTotallerTest: StringSpec ({
    "should be able to add 3 and 4 - and it mustn't go wrong" {
        val totaller = Totaller()

        totaller.add(3) shouldBe 3
        totaller.add(4) shouldBe 7
        totaller.total shouldBe 7
    }
})