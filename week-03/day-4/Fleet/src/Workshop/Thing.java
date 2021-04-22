package Workshop;

public class Thing {

  /**
   * Created by aze on 2017.03.29..
   */

    private String name;
    private boolean completed;


    public Thing(String name) {
      this.name = name;
    }

    public void complete() {
      this.completed = true;
    }
    public void setName(String name){
      this.name = name;
    }

    @Override
    public String toString() {
      return (completed ? "[x] " : "[ ] ") + name;
    }
  }


