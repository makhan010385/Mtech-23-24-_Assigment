/*Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)

Input:- (subjectId, count, top/bottom)
• Output:- based on the last input(top/bottom), output the students details who have scored
max/min in that subjectId
• e.g.
• input: 1 5 top
• output: Kunal 85 Himanshu 84 Geetika 83 Anmol 82 Mahesh 81
*/


class Student(val id: Int, val name: String)

class Mark(val subjectId: Int, val studentId: Int, val marks: Int)
object studentMarks2 {

    def getTopOrBottomScorers(subjectId: Int, count: Int, topOrBottom: String, students: List[Student], marks: List[Mark]): List[Student] = {
      val filteredMarks = marks.filter(_.subjectId == subjectId)
      val sortedMarks = if (topOrBottom == "top") filteredMarks.sortBy(_.marks)(Ordering[Int].reverse) else filteredMarks.sortBy(_.marks)
      val selectedMarks = sortedMarks.take(count)
      val studentIds = selectedMarks.map(_.studentId)
      students.filter(student => studentIds.contains(student.id))
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
        new Mark(1, 2, 84),
        new Mark(1, 3, 83),
        new Mark(1, 4, 82),
        new Mark(1, 5, 81),
        new Mark(2, 1, 75),
        new Mark(2, 2, 85),
        new Mark(2, 3, 55),
        new Mark(2, 4, 65),
        new Mark(2, 5, 95)
      )

      val topScorers = getTopOrBottomScorers(1, 5, "top", students, marks)
      val bottomScorers = getTopOrBottomScorers(1, 5, "bottom", students, marks)

      println("Top Scorers:")
      topScorers.foreach(student => println(s"${student.name} ${student.id}"))

      println("Bottom Scorers:")
      bottomScorers.foreach(student => println(s"${student.name} ${student.id}"))
    }

}
