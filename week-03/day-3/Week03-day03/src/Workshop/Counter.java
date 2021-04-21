package Workshop;

public class Counter {
  private int initialValue;
  private int counter;

  public Counter() {
    this.counter = 0;
    this.initialValue = 0;
  }

  public Counter(int number) {
    this.counter = number;
    this.initialValue = number;
  }

  public void add(int number) {
    counter += number;
  }

  public void add() {
    counter++;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    counter = initialValue;
  }
}
