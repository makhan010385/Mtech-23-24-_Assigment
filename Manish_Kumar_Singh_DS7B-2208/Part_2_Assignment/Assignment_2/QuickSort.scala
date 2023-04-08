
/**
* Implementing QuickSort using List
*/

class UsingQuickSort {
    def sort(lst:List[Int]): List[Int] =   
        if (lst.length < 2) lst
        else {
            val pivot = lst(lst.length / 2)
            sort (lst filter (pivot > _)) ::: (lst filter (pivot == _)) ::: sort (lst filter(pivot < _))
        }
}

object QuickSort extends App {
  
    val quicksort = new UsingQuickSort
    val lst = List(2,1,3,5,4,9,6)
    val list = quicksort.sort(lst)
    println(list)
  	
}
