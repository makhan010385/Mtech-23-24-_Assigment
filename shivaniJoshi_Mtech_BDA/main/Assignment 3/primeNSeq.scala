/*Can you write a recursive function primeSeq(n) that prints all prime number which less than n?
For example prime(10) should print 2,3,5, and 7 on the terminal.*/

object primeNSeq {
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }
  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) true else false
    } else if (n % i == 0) {
      false
    } else if (i * i > n) {
      true
    } else {
      isPrime(n, i + 1)
    }
  }

  def primeSeq(n: Int, i: Int = 2): Unit = {
    if (i >= n) {
      return
    } else if (isPrime(i)) {
      println(i)
    }
    primeSeq(n, i + 1)
  }


}
