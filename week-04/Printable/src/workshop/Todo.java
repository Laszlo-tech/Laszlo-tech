package workshop;

public class Todo implements Printable {
String task;
String priority;
boolean done;

public Todo(){
  task="Buy milk";
  priority = "high";
  done = true;
}
  @Override
  public void printAllFields() {
    System.out.println("Task: "+task+" | Priority:"+priority+" | Done: "+done);
  }
}
