package Workshop;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor() {
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public void hire() {
    hiredStudents += 1;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm, "
            + getName()
            + " a "
            + getAge()
            + " year old"
            + getGender()
            + " who represents "
            + this.company
            + " and hired "
            + this.hiredStudents
            + " students so far.");
  }
}
