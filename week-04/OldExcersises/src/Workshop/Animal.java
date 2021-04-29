package Workshop;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal(){
    this.hunger = 50;
    this.thirst = 50;
  }
  public void eat(){
    this.hunger-= 1;
  }
  public void drink(){
    this.thirst-=1;
  }
  public void play(){
    this.thirst+=1;
    this.hunger+=1;
  }
  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
