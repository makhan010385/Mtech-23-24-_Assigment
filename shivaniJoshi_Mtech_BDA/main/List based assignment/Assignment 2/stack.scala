/*
implement Stack using Lists.
 */
class Stack[A] {
  private var elements: List[A] = Nil

  def push(element: A): Unit = {
    elements = element :: elements
  }

  def pop(): Option[A] = elements match {
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

  override def toString: String = elements.mkString(" -> ")
}


object stack extends App {

  val stack = new Stack[Int]
  stack.push(1)
  stack.push(2)
  stack.push(3)
  println(stack.pop()) // Some(3)
  println(stack.peek()) // Some(2)
  println(stack.isEmpty) // false
  println(stack) // 2 -> 1


}
