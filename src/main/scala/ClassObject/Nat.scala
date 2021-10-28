package ClassObject
import scala.sys.error

trait Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def +(that: Nat): Nat
  def -(that: Nat): Nat

}

object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat = error("Negative Number")
  def successor: Nat = new Succ(Zero)
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = if (that.isZero) Zero else error("Negative Number")

}

class Succ(x: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = x
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat = x + that.successor
  def -(that: Nat): Nat = if (that.isZero) this else x - that.predecessor

}

class Pred(x: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = new Pred(this)
  def successor: Nat = x
  def +(that: Nat): Nat = x + that.predecessor
  def -(that: Nat): Nat = if (that.isZero) this else x - that.successor

}

trait Sign {
  def isPositive: Boolean
  def negate: Sign

}

object Positive extends Sign {
  def isPositive: Boolean = true
  def negate: Sign = Negative

}

object Negative extends Sign {
  def isPositive: Boolean = false
  def negate: Sign = Positive

}