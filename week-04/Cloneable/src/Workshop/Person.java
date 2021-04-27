package Workshop;

public class Person {
  private String name; // the name of the person
  private int age; // the age of the person (whole number)
  private String gender; // the gender of the person (male / female)

  public Person(String name, int age, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void getGoal() {
    System.out.println(
        "My goal is: Live for the moment!"); // prints "My goal is: Live for the moment!"
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm "
            + name
            + ", a"
            + age
            + " year old "
            + gender); // prints "Hi, I'm name, a age year old gender.
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }



}
