package Workshop;

import java.util.ArrayList;

public class Aircraft {
int maxAmmo;
int baseDamage;
String name;
String type;


public int fight(){
  int damage = baseDamage/maxAmmo;
  return damage;
}
public void refillAmmo(int numb){
maxAmmo+=numb;
}
public String getType(){
    String type = this.name;
    return type;
}
//public ArrayList getStatus(String type,int ammo,int baseDamage,int allDamage){

//}
}
