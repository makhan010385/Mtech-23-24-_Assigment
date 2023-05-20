/*
Write Scala functions to solve the following problems.
1. The temperature is 35C; convert this temperature into Fahrenheit. ºF =ºC * 1.8000 + 32.00
 */
object temp {
  def main(args: Array[String]) {

    print("Input temperature in Fahrenheit:");
        var celsius: Float = scala.io.StdIn.readFloat();
        var fahrenheit: Double = celsius * 1.8  + 32;
        println("Temperature in Celsius: " + fahrenheit );
  }
}
