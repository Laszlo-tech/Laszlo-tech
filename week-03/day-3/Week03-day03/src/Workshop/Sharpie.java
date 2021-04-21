package Workshop;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount = 100f;

  public Sharpie(String color, float width) {
    this.color = color;
    inkAmount -= 10;
    this.width = width;
  }
}
