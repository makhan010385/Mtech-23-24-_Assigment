class Rational(x:Int,y:Int) {
   var numer=x;
   var denom=y;
   
   def neg()= new Rational(-numer,denom); 
}

object First {
   def main(args: Array[String]) {
      val x:Rational=new Rational(3,4);
      //1. neg
       var r:Rational=x.neg;
       println(r.numer+"/"+r.denom);
      
       
   }
}
