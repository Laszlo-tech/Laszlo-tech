package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> flyingDutchman = new ArrayList<>();

  public void getPoorPirates() {}

  public int getGolds() {}

  public void lastDayOnTheShip() {}

  public void prepareForBattle(Pirate jack) {
    for (int i = 0; i < 5; i++) {
      jack.work();
    }
  }
}
