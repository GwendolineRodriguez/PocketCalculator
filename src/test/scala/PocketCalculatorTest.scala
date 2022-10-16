import org.scalatestplus.testng.TestNGSuite
import scala.collection.mutable.ListBuffer
import org.testng.Assert.*
import org.testng.annotations.Test
import org.testng.annotations.BeforeMethod
import scala.collection.mutable

import pocketCalculator.*

class PocketCalculatorTest extends TestNGSuite {

  @Test
  def testAddition(): Unit =
    val calc = PocketCalculator()
    println(calc.add(1, 2))
    assertThrows[OverflowException] {calc.add(Int.MaxValue, 2)}
}
