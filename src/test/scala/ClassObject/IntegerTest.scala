package ClassObject
import org.scalatest.funsuite.AnyFunSuite

class IntegerTest extends AnyFunSuite {

  val zero = Zero
  val one = new Succ(zero)
  val two = new Succ(one)
  val three = new Succ(two)

  test("isZero of zero should return true") {
    assert(zero.isZero)
  }

  test("isZero of one should return false") {
    assert(!(one.isZero))
  }

  test("Predecessor of three should return two") {
    assert(three.predecessor == two)
  }

  test("successor of one + Zero should not return zero") {
    assert(!(one.+(zero).successor == zero))
  }

  test("- of zero from one should not return zero") {
    assert(!(one.-(zero).isZero))
  }

  test("- of one from one should return zero") {
    assert(one.-(one).isZero)
  }
  
  test("+ of zero with one should not return zero") {
    assert(!(one.+(zero).successor.isZero))
  }

}
