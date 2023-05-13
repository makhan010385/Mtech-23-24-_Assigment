
class Account(val nic: String, val acnumber: Int, var balance: Double) {
  def transfer(acc: Account, amount: Double): Unit = {
    balance -= amount
    acc.balance += amount
  }
}

object Third {
  def main(args: Array[String]): Unit = {
    val a = new Account("981234567V", 10012, 10000.00)
    val b = new Account("951234567V", 10023, 12000.00)

    a.transfer(b, 2000.00)

    println(s"Balance of b after transfer: ${b.balance}")
  }
}
