package Pirates;

public class Captain extends Pirate {
  private boolean woodenLeg;

  public Captain() {
    this.woodenLeg = woodenLeg;
  }

  @Override
  public void work() {
    super.gold += 10;
    healthPoint -= 10;
  }

  @Override
  public void party() {}
}
