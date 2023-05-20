package scala_class

import scala.io.StdIn._
object input {
  def main(args: Array[String]): Unit = {

    val a = readLine("Enter your first name in capital")
    val b = readLine("Enter your last name in capital")
    val c = readLine("Enter your stream")

    println("First name", a)
    println("Last name", b)
    println("Stream", c)

  }
}
