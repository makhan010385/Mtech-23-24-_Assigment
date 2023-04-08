
class Account(id:String,n: Int, b: Double) {
     val nic:String=id;
     val acnumber:Int=n;
     var balance:Double=b;
     
     def transfer(acc:Account,amount:Double)= {
         this.balance=this.balance-amount;
         acc.balance=acc.balance+amount;
     }

}
   

object Third{
   def main(args: Array[String]) {
   
       val a:Account=new Account("981234567V",10012,10000.00);
       val b:Account=new Account("951234567V",10023,12000.00);
        
       a.transfer(b,2000.00);
      
       println("Balance of b after transfered :"+b.balance);
      
       
   }
}
