/*
Write Scala functions to solve the following problems.
1. Company XYZ & Co. pays all its employees Rs.150 per normal working hour and Rs. 75 per
OT hour. A typical employee works 40 (normal) and 20(OT) hours per week has to pay 10%
tax. Develop a functional program that determines the take home salary of an employee from the
number of working hours and OT hours given
 */
object homeSalaryH extends App {

  private def calculateSalary(normalHours: Int, otHours: Int, taxRate: Double): Double = {
    val normalPay = normalHours * 150
    val otPay = otHours * 75
    val grossPay = normalPay + otPay
    val tax = grossPay * (taxRate / 100)
    val netPay = grossPay - tax
    netPay
  }

  private val netPay = calculateSalary(40, 20, 10)
  println(s"The employee's net pay is Rs.$netPay")
}


