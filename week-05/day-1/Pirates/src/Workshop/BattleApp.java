package Workshop;

public class BattleApp {
  public static void main(String[] args) {

    Ship hajo1 = new Ship();
    Ship hajo2 = new Ship();

    hajo1.fillShip();
    hajo2.fillShip();

    boolean battle = hajo1.shipBattle(hajo2);
    System.out.println(battle);
  }
}
