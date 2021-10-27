package ClassObject
import org.scalatest.flatspec.AnyFlatSpec

class ZeroTest extends AnyFlatSpec {

  val zero = Zero
  val one = zero.successor
  val two = one.successor

  "Check if one is positive" should "return true" in{
    assert(one.isPositive)
  }
  "Check if the predecessor of one is zero" should "return true" in{
    assert(one.predecessor.isZero)
  }
  "Check what negate of two results" should "be negative" in{
    assert(!two.negate.isPositive)
  }

}
