package scala_class

object a1 {
  def main(args: Array[String]): Unit = {
    val rows = 2
    val cols = 3

    val names = Array.ofDim[String](rows, cols)

    names(0)(0) = "Mtech1"
    names(0)(1) = "Mtech2"
    names(0)(2) = "Mtech3"
    names(1)(0) = "Mtech4"
    names(1)(1) = "Mtech5"
    names(1)(2) = "Mtech6"
    for {
      i <- 0 until rows
      j <- 0 until cols
    }

  }
}
