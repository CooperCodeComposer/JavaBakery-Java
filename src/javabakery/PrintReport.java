package javabakery;

import java.util.ArrayList;

/**
 * Class to help driver class print the report
 */
public class PrintReport {

    // Instance variables
    static ArrayList<BakedGood> inventory = new ArrayList<>();

    public static void printHeader() {
        System.out.println("GOOD MORNING JAVA BAKERY!");
        System.out.println("INVENTORY MANAGEMENT SYSTEM");
        System.out.println("");
    }

    public static void createInventory() {

        // add items to inventory array         
        inventory.add(new Cake("Hulk's Cake", 5, Cake.CAKE_TYPE.BIRTHDAY));
        inventory.add(new Cake("Thor Cake", 3, Cake.CAKE_TYPE.POISONOUS));
        inventory.add(new Cookie("Tony's Chocolate Chip Cookies", 48, false));
        inventory.add(new Cookie("Steve's Nutty Cookies", 36, true));

        // print items created 
        for (BakedGood item : inventory) {
            System.out.println("Creating " + item.count + " " + item.name);
        }

        System.out.println("");
    }

    public static void printInventory() {

        System.out.println("TOTAL INVENTORY");

        for (BakedGood item : inventory) {
            System.out.println("\t" + item);
        }

        System.out.println("");
    }

    public static void sellInventory() {

        // Sell 2 Hulk cakes
        checkInventory("Hulk's Cake", 2);
        
        // Sell 1 Thor cake
        checkInventory("Thor Cake", 1);
        
        // Sell 2 dozen Tony’s Chocolate Chip Cookies
        checkInventory("Tony's Chocolate Chip Cookies", 2);
        
        // Sell 5 dozen Steve’s Nutty Cookies
        checkInventory("Steve's Nutty Cookies", 5);
        
        System.out.println("");

    }
    
    // checks inventory and prints count result of sale
    private static void checkInventory(String name, int numToSell) {

        for (int i = 0; i < inventory.size(); i++) {
            // if it's a cake
            if (name.equals(inventory.get(i).name) && (inventory.get(i) instanceof Cake)) {
                if (inventory.get(i).count >= numToSell) {
                    inventory.get(i).sell(numToSell);  // sell and update count
                    System.out.println("Selling " + numToSell + " "
                            + inventory.get(i).name);
                } else {
                    System.out.println("Selling " + numToSell + " "
                            + inventory.get(i).name);
                    System.out.println("Not enough " + inventory.get(i).name + " to sell "
                            + inventory.get(i).count + " available");
                }
            } 
            // else if it's a cookie - remember numToSell is in the dozen in sell method
            else if (name.equals(inventory.get(i).name) && (inventory.get(i) instanceof Cookie)) {
                if ((inventory.get(i).count / 12) >= numToSell) {
                    inventory.get(i).sell(numToSell);  // sell and update count
                    System.out.println("Selling " + (numToSell) + " dozen "
                            + inventory.get(i).name);
                } else {
                    System.out.println("Selling " + (numToSell) + " dozen "
                            + inventory.get(i).name);
                    System.out.println("Not enough " + inventory.get(i).name + " to sell ("
                            + (inventory.get(i).count / 12) + " dozen available)");
                }
            }
        }

    }

}
