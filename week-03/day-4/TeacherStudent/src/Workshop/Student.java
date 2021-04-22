package Workshop;

public class Student {
  String name;

  public Student() {
    this.name = name;
  }

  public void learn() {
    System.out.println("the student is actually learning!");
  }

  public void question(Teacher teacher) {
    teacher.giveAnswer();
  }
}
