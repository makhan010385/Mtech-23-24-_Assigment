/*
Imagine the owner of a movie theater who has complete freedom in setting ticket prices. The
more he charges, the fewer the people who can afford tickets. In a recent experiment the owner
determined a precise relationship between the price of a ticket and average attendance. At a price
of Rs 15.00 per ticket, 120 people attend a performance. Decreasing the price by 5 Rupees increases
attendance by 20 and increasing the price by 5 Rupees decreases attendance by 20. Unfortunately,
the increased attendance also comes at an increased cost. Every performance costs the owner
Rs.500. Each attendee costs another 3 Rupees. The owner would like to know the exact relationship
between profit and ticket price so that he can determine the price at which he can make the highest
profit. Implement a scala functional program to find out the best ticket price.
 */
object profitCalculate extends App {

  def calculateProfit(price: Double): Double = {
    val attendance =
      if (price == 15) 120
      else if (price < 15) 120 + (15 - price) / 5 * 20
      else 120 - (price - 15) / 5 * 20
    val revenue = price * attendance
    val cost = 500 + 3 * attendance
    val profit = revenue - cost
    profit
  }

  def findBestPrice(minPrice: Double, maxPrice: Double): Double = {
    val step = 0.01
    var bestPrice = minPrice
    var maxProfit = 0.0
    var price = minPrice
    while (price <= maxPrice) {
      val profit = calculateProfit(price)
      if (profit > maxProfit) {
        maxProfit = profit
        bestPrice = price
      }
      price += step
    }
    bestPrice
  }

  // To find the best ticket price between Rs.10 and Rs.20:
  val bestPrice = findBestPrice(10, 20)
  println(s"The best ticket price is Rs.$bestPrice")


}
