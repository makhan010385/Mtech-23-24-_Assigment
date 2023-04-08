import scala.math._

object CaseClass extends App {

    val p1=Point(4,5);
    val p2=Point(2,3);

    //call +
    println(p1+" + "+p2+"= "+ p1.+(p2)); //(6,8)

    //move the point by (1,1)
    println(p1+" Move by (1,1) :"+ p1.move(1,1));

    //distance between p1 and p2
    println("Distance between "+p1+" and "+p2+" = " + p1.distance(p2));

    //switch x and y
    println("Invert of "+p1+" = "+ p1.invert()); //(5,4)

}

case class Point(a:Double,b:Double){
    def x:Double=a;
    def y:Double=b;

    ////+ Operator
    def +(point:Point)=Point(this.x+point.x,this.y+point.y);

    //move the point
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);

    //Distance between 2 given points
    def distance(p1:Point):Double={
           val y2:Double=pow(p1.y-this.y,2);
          val x2:Double=pow(p1.x-this.x,2);
          return sqrt(y2+x2);
    }

    //switch x and y
    def invert()=Point(this.y,this.x);

}
