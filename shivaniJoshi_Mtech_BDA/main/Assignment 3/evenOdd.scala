/*
Can you write a recursive function to determine even and odd numbers?

 */
object evenOdd {
  def main(args: Array[String]): Unit = {
    val number = 5
    val isNumberEven = isEven(number)
    if (isNumberEven) {
      println(s"$number is even")
    } else {
      println(s"$number is odd")
    }

  }

  def isEven(n: Int): Boolean = {
    if (n == 0) {
      true
    } else if (n == 1) {
      false
    } else {
      isEven(n - 2)
    }
  }

}
