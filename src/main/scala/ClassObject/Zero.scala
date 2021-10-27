package ClassObject
import scala.sys.error

object Zero extends Nat {

  def isZero: Boolean = true
  def predecessor: Nat = new Pred(this)
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = {
    {
      def iter(n: Nat, res: Nat): Nat = {
        if (n.isZero) res
        else if (n.isPositive) iter(n.predecessor, res.predecessor)
        else iter(n.successor, res.successor)
      }
      iter(that, this)
    }
  }
  override def isPositive: Boolean = false

}
