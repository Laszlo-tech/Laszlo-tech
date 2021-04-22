package Workshop;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing thing  = new Thing("Get milk");
        Thing thing1 = new Thing("Remove the obstacles");
        Thing thing2 = new Thing("Stand up");
        Thing thing3 = new Thing("Eat lunch");
         // Thing newThing = thing.setName("Remove the obstacles");

        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

         fleet.add(thing);
         fleet.add(thing1);
         fleet.add(thing2);
         fleet.add(thing3);
         thing2.complete();
         thing3.complete();
        System.out.println(fleet);
    }
}
