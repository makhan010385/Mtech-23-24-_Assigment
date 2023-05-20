/*
Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)Find the student(s) who have scored 95% or above and print its details.
• input: 95%
• output: Kunal 95% Himanshu 96% Geetika 97%
 */
class Student(val id: Int, val name: String, val marks: Double)

object TopScorers {

    def findTopScorers(minPercentage: Double, students: List[Student]): Unit = {
      val topScorers = students.filter(_.marks >= minPercentage)

      topScorers.foreach(student => println(s"${student.name} ${student.marks}%"))
    }

    def main(args: Array[String]): Unit = {
      val students = List(
        new Student(1, "Kunal", 95),
        new Student(2, "Himanshu", 96),
        new Student(3, "Geetika", 97),
        new Student(4, "Mahesh", 90)
      )

      val minPercentage = 95.0
      findTopScorers(minPercentage, students)
    }
}
