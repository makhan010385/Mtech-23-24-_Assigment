/*Create a method sub to subtract two rational numbers and find an answer x-y-z where x=3/4,
y=5/8, z=2/7.
 */
class Rational(x:Int,y:Int) {
  var numer=x;
  var denom=y;
  def sub(r:Rational)={
    new Rational(numer*r.denom - r.numer*denom,denom * r.denom);
  }
}


object Second {
  def main(args: Array[String]) {
    val x: Rational = new Rational(3, 4);
    val y: Rational = new Rational(5, 8);
    val z: Rational = new Rational(2, 7);
    var k: Rational = x.sub(y);
    var r: Rational = k.sub(z);
    println(r.numer + "/" + r.denom);
  }
}
