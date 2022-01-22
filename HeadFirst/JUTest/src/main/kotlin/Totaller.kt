import io.kotlintest.data.forall
import org.junit.Assert.assertEquals
import org.junit.Test
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.forAll
import io.kotlintest.tables.row



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

    "should be able to add lots of different numbers" {
         forall(
            row(1,2,3),
            row(19,47,66),
            row(11, 21, 32)
         ) { x: Int, y: Int, expectedTotal: Int ->
             val totaller = Totaller(x)
             totaller.add(y) shouldBe expectedTotal
         }
    }
})