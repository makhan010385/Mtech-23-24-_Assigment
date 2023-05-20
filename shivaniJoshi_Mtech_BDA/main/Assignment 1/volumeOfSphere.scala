/*
Write Scala functions to solve the following problems
The volume of a sphere with radius r is 4/3 ffr3. What is the volume of a sphere with radius 5?
 */
object volumeOfSphere {
  def main(args: Array[String]): Unit = {
    val radius = 10
    val volume = sphereVolume(radius)
    println(s"A sphere with radius $radius has volume $volume cubic units.")
  }

  def sphereVolume(radius: Double): Double = {
    val volume = (4.0 / 3.0) * math.Pi * math.pow(radius, 3)
    return volume
  }

}
