package Workshop;

import java.util.Random;

public class Pirate {
  int intoxication;
  boolean alive;
  boolean captain;

  public Pirate() {
    intoxication = 0;
    this.alive = true;
    this.captain = false;
  }

  public void drinkSomeRum() {
    intoxication++;
  }

  public void howsItGoingMate() {
    if (intoxication < 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Argh, I'ma Pirate. How d'ya d'ink it's goin?");
      intoxication = 0;
    }
  }

  public void brawl(Pirate a) {
    Random random = new Random();
    int randomNumber = random.nextInt(4);
    switch (randomNumber) {
      case 1:
        this.alive = false;
        break;
      case 2:
        a.alive = false;
        break;
      case 3:
        a.alive = false;
        this.alive = false;
        break;
    }
  }

  public void die() {
    this.alive = false;
    System.out.println("he is dead");
  }
}
