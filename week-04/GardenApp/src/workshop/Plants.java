package workshop;

public abstract class Plants {
  protected int minWaterAmount;
  protected int currentWaterAmount;
  protected String type;
  protected String color;
  protected float absorbRate;

  public Plants(int minWaterAmount, String type, String color, float absorbRate) {
    this.minWaterAmount = minWaterAmount;
    this.type = type;
    this.color = color;
    this.absorbRate = absorbRate;
  }

  public boolean isThirsty() {
    boolean thirsty = false;
    if (currentWaterAmount <= minWaterAmount) {
      thirsty = true;
    }
    return thirsty;
  }

  public String needsWater() {
    String result = " doesn't need water";
    if (isThirsty()) {
      result = "need water";
    }
    return result;
  }
}
