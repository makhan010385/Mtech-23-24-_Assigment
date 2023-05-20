package scala_class

object loop_first {
  def main(args: Array[String]): Unit = {
    var rank = 0;

    val rankList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    for (rank <- rankList) {
      println("Another rank is :" + rank);
    }
  }

}
