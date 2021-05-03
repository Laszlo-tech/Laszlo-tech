package Workshop;

public class Main {

  public static void main(String[] args) {

    Ship hajo = new Ship();
    Ship hajo2 = new Ship();
    hajo2.fillShip();
    hajo.fillShip();
    System.out.println(hajo.crew.size());
    System.out.println(hajo.toString());
  }
}
