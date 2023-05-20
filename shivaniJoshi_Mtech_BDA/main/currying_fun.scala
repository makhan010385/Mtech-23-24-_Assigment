package scala_class

object currying_fun {
  def add(a:Int) (b:Int) =(c:Int)=> a+b+c;

  def main(args: Array[String]): Unit = {
    println(add(20)(30)(40))
  }
}
