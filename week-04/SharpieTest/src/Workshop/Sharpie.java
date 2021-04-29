package Workshop;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie(String color, double width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(){
    this.inkAmount -=10;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  public void setInkAmount(double inkAmount) {
    this.inkAmount = inkAmount;
  }
}

