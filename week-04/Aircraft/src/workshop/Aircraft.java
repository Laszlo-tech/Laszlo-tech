package workshop;

public abstract class Aircraft {
  protected int maxAmmo;
  protected int baseDamage;
  protected int currentAmmo;

  public Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    currentAmmo = 0;
  }
  public int currentDamage(){
    return currentAmmo*baseDamage;
  }
  public int fight() {
    int madeDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return madeDamage;
  }

  public int refillAmmo(int ammoFromStation) {
    int remainingAmmo = ammoFromStation;
    if (currentAmmo < maxAmmo) {
      do {
        currentAmmo++;
        remainingAmmo--;
      } while (currentAmmo != maxAmmo);
    }
    return remainingAmmo;
  }

  public abstract String getType();

  public String getStatus() {
    return "Type "
        + getType()
        + " Ammo: "
        + currentAmmo
        + ", Base Damage: "
        + baseDamage
        + " All Damage: "
        + currentAmmo * baseDamage
        + ".\n";
  }
   public abstract boolean isPriority();
}
