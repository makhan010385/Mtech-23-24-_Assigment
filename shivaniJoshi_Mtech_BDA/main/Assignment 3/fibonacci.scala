/*
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . . Each
subsequent number is the sum of the previous two. Write a recursive function print fist n Fibonacci
numbers for given n.

 */
object fibonacci {
  def main(args: Array[String]): Unit ={
    val n = 10
    fibonacciSeq(n)

  }
  def fibonacciSeq(n: Int): Unit = {
    if (n > 0) {
      fibonacciSeq(n - 1)
      print(fibonacci(n) + " ")
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      n
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }


}
