package ClassObject

class Pred (x: Nat) extends Nat{

  def isZero: Boolean = false
  def predecessor: Nat = new Pred(this)
  def successor: Nat = x
  def + (that: Nat): Nat = x + that.predecessor
  def - (that: Nat): Nat = x - that.successor

  override def isPositive: Boolean = false

}
