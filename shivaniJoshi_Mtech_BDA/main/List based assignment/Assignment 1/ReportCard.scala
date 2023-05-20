/*
Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)For every student, find its marks in detail (just like detailed Report card of a student.)
• Note:- must use groupBy method of List
• input: reportcard
• output: Kunal 75 70 80 75 75% Himanshu 74 70 81 75 75% Geetika 70 70 85 75 75%
 */
class Student(val id: Int, val name: String, val subjectMarks: Map[String, Int]) {
  def calculatePercentage(): Double = {
    val totalMarks = subjectMarks.values.sum
    val totalSubjects = subjectMarks.size
    val percentage = (totalMarks.toDouble / (totalSubjects * 100)) * 100
    percentage
  }

  override def toString: String = {
    val marksStr = subjectMarks.values.mkString(" ")
    val percentage = calculatePercentage()
    s"$name $marksStr ${percentage}%"
  }
}
object ReportCard {
  def generateReportCard(students: List[Student]): Unit = {
    val groupedStudents = students.groupBy(_.id)

    groupedStudents.values.flatten.foreach(student => println(student))
  }

  def main(args: Array[String]): Unit = {
    val students = List(
      new Student(1, "Kunal", Map("Subject1" -> 75, "Subject2" -> 70, "Subject3" -> 80, "Subject4" -> 75)),
      new Student(2, "Himanshu", Map("Subject1" -> 74, "Subject2" -> 70, "Subject3" -> 81, "Subject4" -> 75)),
      new Student(3, "Geetika", Map("Subject1" -> 70, "Subject2" -> 70, "Subject3" -> 85, "Subject4" -> 75))
    )

    generateReportCard(students)
  }

}
