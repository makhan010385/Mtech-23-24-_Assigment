/*
 apply quicksort on the Lists
 */
object quicksort extends App {
  def quickSort[A](list: List[A])(implicit ord: Ordering[A]): List[A] = {
    list match {
      case Nil => Nil
      case pivot :: tail =>
        val (less, greater) = tail.partition(ord.lt(_, pivot))
        quickSort(less) ::: pivot :: quickSort(greater)
    }
  }

  // Example usage
  val myList = List(5, 2, 8, 1, 9, 3)
  val sortedList = quickSort(myList)
  println(sortedList)


}
