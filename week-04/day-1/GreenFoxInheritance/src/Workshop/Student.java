package Workshop;

public class Student extends Person {
  private String previousOrganization; // the name of the student’s previous company / school
  private int skippedDays; // the number of days skipped from the course

  public Student() {
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void getGoal() {}

  public void introduce() {}

  public void skipDays(int a) {
    skippedDays += a;
  }
}
