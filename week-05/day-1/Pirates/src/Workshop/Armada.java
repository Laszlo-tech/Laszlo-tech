package Workshop;

import java.util.List;

public class Armada {
  List<Ship> armada;

    public boolean war(Armada otherArmada) {
    for (int i = 0; i < armada.size() ; i++) {
      armada.get(i).shipBattle(otherArmada.armada.get(i));


    }
   }
}
