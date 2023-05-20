/*
implement Queue using Lists.
 */
class Queue[A] {
  private var elements: List[A] = Nil

  def enqueue(element: A): Unit = {
    elements = elements :+ element
  }

  def dequeue(): Option[A] = elements match {
    case Nil => None
    case head :: tail =>
      elements = tail
      Some(head)
  }

  def peek(): Option[A] = elements match {
    case Nil => None
    case head :: _ => Some(head)
  }

  def isEmpty: Boolean = elements.isEmpty

  override def toString: String = elements.mkString(" <- ")
}

object queue extends App {
  val queue = new Queue[Int]
  queue.enqueue(1)
  queue.enqueue(2)
  queue.enqueue(3)
  println(queue.dequeue()) // Some(1)
  println(queue.peek()) // Some(2)
  println(queue.isEmpty) // false
  println(queue) // 2 <- 3

}
