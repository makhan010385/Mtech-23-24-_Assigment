/*Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)
Input:- (top/bottom, count)
• OutPut:- Overall top/least scorer based on all the subjects score, fetch students name countinput defines that how much students name are to be printed on console
• e.g. input: top 2
output: Himanshu 75% Geetika 74%
*/

class Student(val id: Int, val name: String)

class Mark(val subjectId: Int, val studentId: Int, val marks: Int)

object studentsMarks3 {

    def getOverallScorers(topOrBottom: String, count: Int, students: List[Student], marks: List[Mark]): List[(String, Double)] = {
      val studentScores = students.map { student =>
        val totalMarks = marks.filter(_.studentId == student.id).map(_.marks).sum
        val percentage = (totalMarks.toDouble / marks.length) * 100
        (student.name, percentage)
      }

      val sortedStudentScores = if (topOrBottom == "top") studentScores.sortBy(_._2)(Ordering[Double].reverse) else studentScores.sortBy(_._2)
      sortedStudentScores.take(count)
    }

    def main(args: Array[String]): Unit = {
      val students = List(
        new Student(1, "Kunal"),
        new Student(2, "Himanshu"),
        new Student(3, "Geetika"),
        new Student(4, "Anmol"),
        new Student(5, "Mahesh")
      )

      val marks = List(
        new Mark(1, 1, 85),
        new Mark(2, 1, 75),
        new Mark(1, 2, 84),
        new Mark(2, 2, 85),
        new Mark(1, 3, 83),
        new Mark(2, 3, 55),
        new Mark(1, 4, 82),
        new Mark(2, 4, 65),
        new Mark(1, 5, 81),
        new Mark(2, 5, 95)
      )

      val topScorers = getOverallScorers("top", 2, students, marks)
      val leastScorers = getOverallScorers("bottom", 2, students, marks)

      println("Top Scorers:")
      topScorers.foreach { case (name, percentage) =>
        println(s"$name ${percentage}%")
      }

      println("Least Scorers:")
      leastScorers.foreach { case (name, percentage) =>
        println(s"$name ${percentage}%")
      }
    }
}
