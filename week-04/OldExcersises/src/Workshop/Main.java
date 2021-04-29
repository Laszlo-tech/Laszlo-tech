package Workshop;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    PostIt a = new PostIt("orange", "Idea 1", "blue");
//    PostIt b = new PostIt("pink","Awsome","black");
//    PostIt c = new PostIt("yellow","Superb!","green");
//
//    System.out.println(a.toString());
//
    Animal cat = new Animal();
    System.out.println(cat.getHunger());
    cat.eat();
    System.out.println(cat.getHunger());

    List<Animal> animals = new ArrayList<Animal>();
    animals.add(cat);

    Farm myFarm = new Farm(animals,10);
    myFarm.breed();
    System.out.println(myFarm.animals.size());

    myFarm.sell();
    System.out.println(myFarm.animals.size());
  }
}
