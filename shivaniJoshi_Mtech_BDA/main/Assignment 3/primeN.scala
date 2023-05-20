/*
Can you write a recursive function prime(n) in scala that returns true for a prime number and false for
the other? For example prime(5) should return true and prime(8) should return false.
 */
object primeN {
  def main(args: Array[String]): Unit = {
    val n = 5
    if (isPrime(n)) {
      println(s"$n is prime")
    } else {
      println(s"$n is not prime")
    }

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


}
