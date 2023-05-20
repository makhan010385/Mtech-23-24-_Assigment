/*
Can you write a recursive function returns the addition of numbers from1 to n? For example
sum(5) should print 15
 */
import scala.io.StdIn._
object oneToN {
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n = readInt()
    println(addition(n))
  }

    def addition(n: Int): Int = {
      if (n == 0)
        0
      else
        n + addition(n - 1)
    }

  }
