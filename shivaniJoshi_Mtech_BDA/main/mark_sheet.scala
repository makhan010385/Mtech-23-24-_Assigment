package scala_class

import scala.io.StdIn._
object mark_sheet {
  def main(args: Array[String]): Unit = {

    println("no of subjects")
    val m = readInt()

    println("enter all subjects marks")
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val d = readInt()
    val e = readInt()

    val t: Int = a + b + c + d + e

    val per: Float = t / m
    println(per)
    /* If % is 80 -90    Print  A+ grade
           70-80   print A  Grade
           60-70   Print B grade
            45-60    Print C grade
          Below 45 Shows failed student
*/
    if (per >= 90) {
      println("O GRADE")
    }
    else if (per >= 80) {
      println("A+ GRADE")
    }
    else if (per >= 70) {
      println("A GRADE")
    }
    else if (per >= 60) {
      println("B+ GRADE")
    }
    else if (per >= 50) {
      println("B GRADE")
    }
    else if (per >= 40) {
      println("C+ GRADE")
    }
    else if (per >= 33) {
      println("C GRADE")
    }
    else {
      println("FAIL")
    }

  }
}
