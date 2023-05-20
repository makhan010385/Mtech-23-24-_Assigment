/*Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)
1. Input:- (subjectId, percentage, pass/fail)
• Output:- for input pass, evaluate that how much students(id, name) are passed in the inputted
subjectId for input fail, evaluate that how much students(id, name) are failed in the inputted
subjectId
• Note:- percentage is the input which defines the minimum passing criteria
• e.g. Pass count: 15 Fail count: 10*/


class Student(val id: Int, val name: String)
class Mark(val subjectId: Int, val studentId: Int, val marks: Int)
object StudentMarks {
    def evaluateStudents(subjectId: Int, percentage: Double, status: String, students: List[Student], marks: List[Mark]): Int = {
      val passedStudents = marks.filter(mark => mark.subjectId == subjectId && mark.marks >= percentage && status == "pass")
      val failedStudents = marks.filter(mark => mark.subjectId == subjectId && mark.marks < percentage && status == "fail")

      if (status == "pass") passedStudents.length
      else if (status == "fail") failedStudents.length
      else 0
    }

    def main(args: Array[String]): Unit = {
      val students = List(
        new Student(1, "John"),
        new Student(2, "Alice"),
        new Student(3, "Bob"),
        new Student(4, "Emily"),
        new Student(5, "Tom")
      )

      val marks = List(
        new Mark(1, 1, 80),
        new Mark(1, 2, 70),
        new Mark(1, 3, 60),
        new Mark(1, 4, 50),
        new Mark(1, 5, 90),
        new Mark(2, 1, 75),
        new Mark(2, 2, 85),
        new Mark(2, 3, 55),
        new Mark(2, 4, 65),
        new Mark(2, 5, 95)
      )

      val passCount = evaluateStudents(1, 60.0, "pass", students, marks)
      val failCount = evaluateStudents(1, 60.0, "fail", students, marks)

      println(s"Pass count: $passCount Fail count: $failCount")
    }


}
