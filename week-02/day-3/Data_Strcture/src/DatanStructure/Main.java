package DatanStructure;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    // I would like to replace "dishwasher" with "galaxy" in this example variable, but it has a
    // problem
    // Please fix it for me!
    // Expected output: In a galaxy far far away
    // String example = "in a dishwasher far far away";
    // example = example.replace("dishwasher", "galaxy");
    // System.out.println(example);

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    // String url = "https//www.reddit.com/r/nevertellmethebots";
    // url = url.replace("bots", "odds");
    // String sep_url = url.substring(5);
    // url = "https:"+sep_url;
    // System.out.println(url);

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the
    // StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the 0string)!

    // String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's
    // Law.";
    // StringBuilder sb = new StringBuilder();
    // sb.append(quote);
    // sb.insert(sb.indexOf("It")+3,"always takes longer than ");
    // System.out.println(sb);

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText applying indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games\
    //      - Diablo
    /*
    String todoText = " - Buy milk\n";
    StringBuilder sb = new StringBuilder();
    sb.append("My todo:\n");
    sb.append(todoText);
    sb.append(" - Download games\n\t");
    sb.append(" - Diablo");
    String result =  sb.toString();
    System.out.println(result);
    */
    /*
    /////List exercises/////
    List<String> myList = new ArrayList<>();
    myList.add("William");
    myList.add("Jhon");
    myList.add(0, "Abel");
    myList.add(3,"Karcsi");
    myList.remove(2);
    System.out.println(myList);
    System.out.println(myList.get(2));

    System.out.println(myList);
    */

    ///// Map exercises/////
    /*
    Map<Integer,Character> myMap = new HashMap<>();
    myMap.put(91, 'a');
    myMap.put(98, 'b');
    myMap.put(99, 'c');
    myMap.put(65, 'A');
    myMap.put(66, 'B');
    myMap.put(67, 'C');
    myMap.put(68, 'D');
    myMap.remove(97);
    if (myMap.size() == 0){
      System.out.println("Empty");
    }else{
      System.out.println("Not empty!");
    }
    System.out.println(myMap.keySet());
    System.out.println(myMap.size());
    System.out.println(myMap.get(99));
    */
    Map<String, String> myMap = new HashMap<>();

    myMap.put("978-1-60309-452-8", "A Letter to Jo");
    myMap.put("978-1-60309-459-7", "Lupus");
    myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    myMap.put("978-1-60309-461-0", "The Lab");

    for (String entry : myMap.keySet()) {
      String value = myMap.get(entry);
      System.out.println(entry + " :" + value);
    }
    myMap.remove("978-1-60309-444-3");
    System.out.println(myMap);

    for (Map.Entry<String, String> entry : myMap.entrySet()) {
      if (entry.getValue() == "The Lab") {
        String index = entry.getKey();
        myMap.remove(index);
      }
    }
    System.out.println(myMap);
    myMap.put("978-1-60309-450-4","They Called Us Enemy");
    myMap.put("978-1-60309-453-5",	"Why Did We Trust Him?");
    System.out.println(myMap);

    myMap.get("478-0-61159-424-8");

    System.out.println(myMap.get( "978-1-60309-453-5"));

  }
}
