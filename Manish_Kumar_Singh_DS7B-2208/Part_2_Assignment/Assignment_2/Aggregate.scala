/**
aggregate the contents of two lists of same size into a single list
	List(1,2) and List("a", "b") results List(List(1, "a"), List(2, "b"))
*/

object Aggregate extends App
{
	val lst1 = List(1,2,3)
	val lst2 = List("a","b","c")
	val lst = lst1 zip lst2
	val list = lst.map(x => List(x._1, x._2))
	println(list)
}
