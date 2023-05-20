/*
Find the last element of list with its index value(dont use inbuilt methods to␣extract last element directly)
 */
object lastelementL extends App {
  def getLastElementWithIndex[A](list: List[A]): (A, Int) = {
    def getLastElementWithIndexHelper(list: List[A], currentIndex: Int): (A, Int) = {
      list match {
        case head :: Nil => (head, currentIndex)
        case _ :: tail => getLastElementWithIndexHelper(tail, currentIndex + 1)
        case Nil => throw new NoSuchElementException("Empty list")
      }
    }

    getLastElementWithIndexHelper(list, 0)
  }

  val myList = List(1, 2, 3, 4, 5)
  val (lastElement, lastIndex) = getLastElementWithIndex(myList)
  println(s"Last element: $lastElement, Index: $lastIndex")


}
