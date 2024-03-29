class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val accNum:Int = n
    var balance:Double = b

    override def toString= "["+nic+":"+accNum+":"+balance+"]"
}

object Fourth{

 def main(args: Array[String]) {
 
 
       val a:Account=new Account("981234567V",10012,-500.00);
       val b:Account=new Account("951234567V",10023,1200.00);
        var bank:List[Account]=List(a,b);
       
      
       val overdraft = bank.filter(x=>x.balance<0)
       println("Over Draft Accounts : "+overdraft);
      
       
       var total = bank.map(x=>x.balance).reduce((x,y) => x+y)
       println("Total Balance = " +total)
       
      
       bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
       println("With Interest :"+bank);}      
 }