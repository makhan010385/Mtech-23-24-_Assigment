/*
 Can you write a recursive function to get the addition of all even numbers less than given n
 */
object evenAddition {
  def main(args: Array[String]): Unit = {
    val n = 10
    val result = sumEven(n)
    println(result)


  }

  def sumEven(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (n % 2 == 0) {
      n - 2 + sumEven(n - 2)
    } else {
      n - 1 + sumEven(n - 1)
    }
  }


}
