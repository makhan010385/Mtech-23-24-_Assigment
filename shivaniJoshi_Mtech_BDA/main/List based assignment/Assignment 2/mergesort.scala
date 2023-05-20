/*
 apply mergesort on the Lists
 */
object mergesort extends App {
  def mergeSort[A](list: List[A])(implicit ord: Ordering[A]): List[A] = {
    def merge(left: List[A], right: List[A]): List[A] = (left, right) match {
      case (Nil, right) => right
      case (left, Nil) => left
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (ord.lt(leftHead, rightHead))
          leftHead :: merge(leftTail, right)
        else
          rightHead :: merge(left, rightTail)
    }

    val n = list.length / 2
    if (n == 0)
      list
    else {
      val (left, right) = list.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  // Example usage
  val myList = List(5, 2, 8, 1, 9, 3)
  val sortedList = mergeSort(myList)
  println(sortedList)


}
