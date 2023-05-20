/*
Write Scala functions to solve the following problems
Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.Shipping
costs Rs. 3 for the first 50 copy and 75 cents for each additional copy. What is the total wholesale
cost for 60 copies?
 */
object wholesale {
  def main(args: Array[String]): Unit = {
    val wholeCost = wholesaleCost(60)
    println(s"The wholesale cost for 60 copies is Rs. $wholeCost.")

  }

  def wholesaleCost(numCopies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val discountedPrice = coverPrice * (1 - discount)

    var shippingCost = 0.0
    if (numCopies <= 50) {
      shippingCost = 3.0
    } else {
      shippingCost = 3.0 + 0.75 * (numCopies - 50)
    }

    val totalCost = numCopies * discountedPrice + shippingCost
    return totalCost
  }
}

