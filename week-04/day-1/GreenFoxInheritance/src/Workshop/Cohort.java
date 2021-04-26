package Workshop;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList students;
  ArrayList mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList();
    this.mentors = new ArrayList();
  }

  public void info() {
    // prints "The name cohort has students.size() students and mentors.size() mentors."
    System.out.println(
        "The "
            + this.name
            + " cohort has"
            + students.size()
            + " students and "
            + mentors.size()
            + " mentors");
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }
}
