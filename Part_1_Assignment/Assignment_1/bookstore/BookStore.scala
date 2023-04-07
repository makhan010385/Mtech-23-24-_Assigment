object BookStore extends App{
 
  def totalCost(copies:Double)=24.95*copies-24.95*0.4*copies+3.0*50.0+0.75*10.0;
  println(totalCost(60))


}
