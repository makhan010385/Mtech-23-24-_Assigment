/*Every Student has some marks associated with it. Student details contains its id and name. And
for Marks, there are subjectId, studentId and number of marks a student scored.
Following are the requirements which is required to gain from above scenario (i.e. Student and
marks)
Input:- (percentage, good_scholarship, normal_or_no_scholarship)
• Output:- two groups of students with the amount of scholarship
• e.g. input: 85% 2000 500
• output: Kunal 2000 Himanshu 500 Geetika 2000 Mahesh 500
*/

class Student(val id: Int, val name: String, val marks: Int)

object StudentScholarship {

    def categorizeStudents(percentage: Double, goodScholarship: Int, normalOrNoScholarship: Int, students: List[Student]): List[(String, Int)] = {
      val goodScholarshipStudents = students.filter(s => s.marks >= (percentage / 100) * 100).map(student => (student.name, goodScholarship))
      val normalOrNoScholarshipStudents = students.filterNot(goodScholarshipStudents.contains).map(student => (student.name, normalOrNoScholarship))

      goodScholarshipStudents ++ normalOrNoScholarshipStudents
    }

    def main(args: Array[String]): Unit = {
      val students = List(
        new Student(1, "Kunal", 85),
        new Student(2, "Himanshu", 70),
        new Student(3, "Geetika", 90),
        new Student(4, "Mahesh", 75)
      )

      val categorizedStudents = categorizeStudents(85.0, 2000, 500, students)

      categorizedStudents.foreach { case (name, scholarshipAmount) =>
        println(s"$name $scholarshipAmount")
      }
    }

}
