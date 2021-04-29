package Workshop;

import java.util.List;
import javax.xml.namespace.QName;

public class Farm {
  List<Animal> animals;
  int limit;

  public Farm(List animals, int limit) {
    this.animals = animals;
    this.limit = limit;
  }

  public void breed() {
    if(limit != 0){
      Animal name = new Animal();
      animals.add(name);
      limit-=1;
    }
  }

  public void sell(){
    int index = 0;
    int max = 0;
    Animal name = new Animal();
    for (int i = 0; i < animals.size() ; i++) {
       name = animals.get(i);
       if(name.getHunger()>max){
         max = name.getHunger();
         index =i;
       }
       animals.remove(name);

      }
    }
  }

