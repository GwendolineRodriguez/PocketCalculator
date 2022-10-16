import org.scalatestplus.testng.TestNGSuite
import scala.collection.mutable.ListBuffer
import org.testng.Assert._
import org.testng.annotations.Test
import org.testng.annotations.BeforeMethod
import scala.collection.mutable

class NGSuiteTest extends TestNGSuite {
  var sb: mutable.StringBuilder = _
  var lb: ListBuffer[String] = _

  @BeforeMethod def initialize(): Unit = {
    import scala.collection.mutable
    sb = new mutable.StringBuilder("ScalaTest is ")
    lb = new ListBuffer[String]
  }

  @Test def verifyEasy(): Unit = { // Uses TestNG-style assertions
    sb.append("easy!")
    assertEquals("ScalaTest is easy!", sb.toString)
    assertTrue(lb.isEmpty)
    lb += "sweet"
    try {
      "verbose".charAt(-1)
      fail()
    } catch {
      case e: StringIndexOutOfBoundsException => // Expected
    }
  }

  @Test def verifyFun(): StringIndexOutOfBoundsException = { // Uses ScalaTest assertions
    sb.append("fun!")
    assert(sb.toString === "ScalaTest is fun!")
    assert(lb.isEmpty)
    lb += "sweeter"
    intercept[StringIndexOutOfBoundsException] {
      "concise".charAt(-1)
    }
  }
}
