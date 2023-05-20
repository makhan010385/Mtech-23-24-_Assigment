package scala_class

class areaOfCircle{
  val r : Int = 4

  def show(): Unit = {
    val a = 3.14*r*r
    println(a)
  }
}
object areaCircle {
  def main(args: Array[String]): Unit= {
    val obj = new areaOfCircle()
    obj.show()
  }

}
