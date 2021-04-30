package Pirates;

public class Pirate {
  private String name;
  private int gold;
  private int healthPoint;

  public Pirate() {
    this.name = name;
    this.gold = 10;
    this.healthPoint = 10;
  }

  public void work() {
    gold += 1;
    healthPoint -= 1;
  }

  public void party() {
    healthPoint += 1;
  }
  @Override
  public void toString(){

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}
