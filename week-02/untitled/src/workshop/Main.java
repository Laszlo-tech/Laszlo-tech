package workshop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String>shoppingList = new ArrayList<>();
        shoppingList.add("Eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");


    }
    public static void checkList(List<String>shoppingList,String input){
//        for (String item :shoppingList ) {
            if(shoppingList.contains(input)){
        System.out.println("Yes we do have "+input);
            }else{
        System.out.println("No, we don't have "+input);
            }
        }
    }

//}
