package Workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew;
  Pirate captain;
  Pirate b;

  public Ship() {
    crew = new ArrayList<>();
    this.captain = new Pirate();
    this.b = new Pirate();
  }

  public void fillShip() {
    Pirate a = new Pirate();
    a.captain = true;
    Random random = new Random();
    crew.add(a);
    int randomPirates = random.nextInt(114);
    for (int i = 0; i < randomPirates; i++) {
      crew.add(new Pirate());
    }
  }

  public int getScore() {
    int score = 0;
    for (int i = 0; i < this.crew.size(); i++) {
      if (this.crew.get(i).alive) {
        score++;
      }
    }
    score -= this.captain.intoxication;
    return score;
  }

  public void randomDeathGenerator() {
    Random random = new Random();
    int randomDeath = random.nextInt(this.crew.size());
    for (int i = 0; i < randomDeath; i++) {
      this.crew.get(i).alive = false;
    }
  }

  public boolean shipBattle(Ship otherShip) {
    boolean result = false;
    if (this.getScore() > otherShip.getScore()) {
      otherShip.randomDeathGenerator();
      result = true;

    } else {
      this.randomDeathGenerator();
    }
    return result;
  }

  @Override
  public String toString() {
    int numbersOfAlive = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).alive) {
        numbersOfAlive++;
      }
    }
    return "The captain consumed "
        + captain.intoxication
        + " rum and he is "
        + captain.alive
        + "."
        + numbersOfAlive;
  }
}
