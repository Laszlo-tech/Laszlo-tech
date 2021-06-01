package workshop;

import java.util.Random;

public class Pirate {
  int intoxication;
  boolean alive;

  public Pirate() {
    intoxication = 0;
    alive = true;
  }

  public void drinkSomeRum() {
    intoxication += 1;
  }

  public void howItGoingMate() {
    if (intoxication > 4) {
      intoxication = 0;
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    } else {
      System.out.println("Pour me anudder!");
    }
  }

  public void fight() {}

  public void brawl(Pirate otherPirate) {
    Random randomNumber = new Random();
    int random = randomNumber.nextInt(4);
    if (this.alive && otherPirate.alive) {
      switch (random) {
        case 1:
          otherPirate.alive = false;
          break;
        case 2:
          this.alive = false;
          break;
        case 3:
          this.alive = false;
          otherPirate.alive = false;
          break;
      }
    }
  }
  public void die(){

  }
}
