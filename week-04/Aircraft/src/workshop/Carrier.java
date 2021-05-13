package workshop;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> airCraftStorage;
  private int ammoStorage;
  private int healthPoint;

  public Carrier(int ammo, int healthPoint) {
    this.ammoStorage = ammo;
    this.healthPoint = healthPoint;
    airCraftStorage = new ArrayList<>();
  }

  public void add(Aircraft aircraft) {
    airCraftStorage.add(aircraft);
  }

  public void fill() {
    if (ammoStorage == 0) {
      throw new IllegalArgumentException("No enough ammo");
    }
    for (Aircraft aircraft : airCraftStorage) {
      if (ammoStorage > aircraft.maxAmmo && aircraft.isPriority()) {
        ammoStorage = aircraft.refillAmmo(ammoStorage);
      }
    }
    for (Aircraft aircraft : airCraftStorage) {
      if (ammoStorage > aircraft.maxAmmo && !aircraft.isPriority()) {
        ammoStorage = aircraft.refillAmmo(ammoStorage);
      }
    }
  }

  public void fight(Carrier anotherCarrier) {
    int damage = 0;
    for (Aircraft aircraft : airCraftStorage) {
      damage = aircraft.fight();
      anotherCarrier.healthPoint -= damage;
    }
  }

  public String getStatus() {
    return "HP: "
        + healthPoint
        + " Aircraft count: "
        + airCraftStorage.size()
        + " Ammo Storage: "
        + ammoStorage
        + " Total damage: "
        + getTotalDamage();
  }

  private int getTotalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : airCraftStorage) {
      totalDamage += aircraft.currentDamage();
    }
    return totalDamage;
  }

}
