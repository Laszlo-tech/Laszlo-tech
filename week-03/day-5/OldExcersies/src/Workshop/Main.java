package Workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<String> shoppingList =
        new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
    System.out.println("Do we have: ");
    Scanner scan = new Scanner(System.in);
    String item = scan.nextLine();
    if (shoppingList.contains(item)) {
      System.out.println("Yes,we do have: "+ item);
    }else{
      System.out.println("No unfortunately, we ran out of: "+item);
    }
    /*List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
      int sum = 1;
      double average = 0;
      for (int i = 0; i < expenses.size(); i++) {
        sum += expenses.get(i);
         average = sum/expenses.get(i);
      }
      System.out.println(average);

      //System.out.println("This is the total we've spent : " + sum);
      int greatest = expenses.get(0);
      for (Integer max : expenses) {
        if (max > greatest) {
          greatest = max;
        }
      }
      int smallest = expenses.get(0);
      for (Integer min : expenses) {
        if (min < smallest) {
          smallest = min;
        }
      }
      System.out.println(smallest);
      System.out.println(greatest);
    }
    // System.out.println("Minimum is: "+ min);

     List<String> listA =
        new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    List<String> listB = new ArrayList<>(listA);
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
    if (listA.size() > listB.size()) {
      System.out.println("list A is bigger!");
    } else {
      System.out.println("listB is bigger!");
    }
    //System.out.println(listA.indexOf("Avocado"));
    //System.out.println(listB.indexOf("Durian"));
    listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));
    System.out.println(listA.get(2));

    ArrayList<String> names = new ArrayList<>();
    names.add("William");
    names.add("Jhon");
    names.add("Amanda");

    // System.out.println(names.size());
    // System.out.println(i+1+". "+names.get(i));
    // }
    names.remove(1);
    // System.out.println(names.get());
    for (int i = names.size() - 1; i >= 0; i--) {
    // System.out.println(names.get(2));
    // for (int i = 0; i < names.size(); i++) {
    // System.out.println(names.get(i));

      System.out.println(names.get(i));
    }
    names.removeAll(names);

         */
  }
}
