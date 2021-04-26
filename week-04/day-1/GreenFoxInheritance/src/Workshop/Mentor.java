package Workshop;

public class Mentor extends Person {
  String level; // the level of the mentor (junior / intermediate / senior


  public Mentor(){
  super();
  }
  public Mentor(String name,int age, String gender, String level){
    super(name,age,gender);
    this.level = "intermediate";

  }
public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
}


@Override
public void introduce(){
    System.out.println(
        "Hi, I'm "
            + getName()
            + ", a"
            + getAge()
            + " year old "
            + getGender()
            + this.level
            + " mentor.");
}

}
