package ClassObject

class Succ(x: Nat) extends Nat{
  def isZero: Boolean = false
  def predecessor: Nat = x
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat = x + that.successor
  def - (that: Nat): Nat = x - that.predecessor
  override def isPositive: Boolean = true

}
