package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing firstThing = new Thing("Get milk");
        Thing secondThing = new Thing("Remove obstacles");
        Thing thirdThing = new Thing("Stand up");
        Thing forthThing = new Thing("Eat lunch");

        thirdThing.complete();
        forthThing.complete();

        fleet.add(firstThing);
        fleet.add(secondThing);
        fleet.add(thirdThing);
        fleet.add(forthThing);

        fleet.toString();

        System.out.println(fleet);
    }
}

