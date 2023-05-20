/*
Implement a Data Structure for Rational Number and create a method neg to class Rational
that is used like this: x.neg // evaluates to –x
 */
class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero.")

  private val gcdValue: Int = gcd(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcdValue
  val denom: Int = denominator / gcdValue

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object negM {

    def main(args: Array[String]) {
      val x = new Rational(3, 4)
      val negX = x.neg

      println(x) // Output: 3/4
      println(negX) // Output: -3/4

    }
}
