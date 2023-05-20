/*
A Bank defines as List of Accounts. So implement the following functions: 4.1 List of Accounts
with negative balances 4.2 Calculate the sum of all account balances 4.3 Calculate the final balances
of all accounts after apply the interest function as fallows: If balance is positive, deposit interest is
.05 and if balance is negative, overdraft interest is .1

 */
class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val accNum:Int = n
  var balance:Double = b
  override def toString= "["+nic+":"+accNum+":"+balance+"]"
}


object fourth {
  def main(args: Array[String]) {
    //List of acc
    val a: Account = new Account("981234567V", 10012, -500.00);
    val b: Account = new Account("951234567V", 10023, 1200.00);
    var bank: List[Account] = List(a, b);
    //overdraft acc
    val overdraft = bank.filter(x => x.balance < 0)
    println("Over Draft Accounts : " + overdraft);
    // Sum
    var total = bank.map(x => x.balance).reduce((x, y) => x + y)
    println("Total Balance = " + total)
    //interest
    bank.map(x => if (x.balance > 0) x.balance = x.balance * 1.05 else x.balance = x.balance *1.1)
    println("With Interest :" + bank);
  }


}
