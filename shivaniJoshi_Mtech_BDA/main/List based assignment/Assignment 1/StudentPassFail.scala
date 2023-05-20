/*Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)
Input:- (pass/fail, percentage) count and print the number of students and all names who are
passed/fail, Pass or fail would be decided by percentage input field.
• e.g. input: fail 30
• output: Kunal 28% Himanshu 29%
 */

class Student(val id: Int, val name: String, val marks: Int)
object StudentPassFail {
    def countAndPrintStudents(criteria: String, percentage: Double, students: List[Student]): Unit = {
      val passStudents = students.filter(s => s.marks >= (percentage / 100) * 100)
      val failStudents = students.filterNot(passStudents.contains)

      val selectedStudents = if (criteria.equalsIgnoreCase("pass")) passStudents else failStudents

      selectedStudents.foreach(student => println(s"${student.name} ${student.marks}%"))
    }

    def main(args: Array[String]): Unit = {
      val students = List(
        new Student(1, "Kunal", 28),
        new Student(2, "Himanshu", 29),
        new Student(3, "Geetika", 35),
        new Student(4, "Mahesh", 42)
      )

      countAndPrintStudents("fail", 30.0, students)
    }



}
