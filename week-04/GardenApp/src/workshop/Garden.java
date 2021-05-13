package workshop;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plants> plantHolder;

  public Garden() {
    plantHolder = new ArrayList<>();
  }

  public void addPlant(Plants plant) {
    plantHolder.add(plant);
  }

  public void watering(int waterAmount) {
    int counter = 0;
    for (Plants plant : plantHolder) {
      if (plant.isThirsty()) {
        counter++;
      }
    }
    int availableForOnePlant = waterAmount / counter;
    for (Plants plant : plantHolder) {
      plant.currentWaterAmount += availableForOnePlant * plant.absorbRate;
    }
  }

  @Override
  public String toString() {
    String result = "";
    for (Plants plant : plantHolder) {
      result += "The " + plant.color + " " + plant.type + " " + plant.needsWater() + "\n";
    }
    return result;
  }
}
