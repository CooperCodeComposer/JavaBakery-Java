//*************************-=-=-=-=-=-=-=-=-=-=-=-=-**************************// 
//********************<           JAVA BAKERY             >*******************//
//*************************-=-=-=-=  V 2.0  -=-=-==-**************************//
//**************                     AUTHOR                     **************//
//---------------<_>------->>>   ALISTAIR COOPER   <<<-------<_>--------------//
//*****************<_>         CREATED: 05/17/2016          <_>***************//
//**************************-=-=-=-=-=-=-=-=-=-=-=-=-*************************//
// program to track inventory of treats baked by the MCU                      //

package driver;

import javabakery.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * JavaBakery class used to test bakery classes
 */
public class JavaBakery {
    
    // Instance variables
    static ArrayList<Cookie> inventoryCookies = new ArrayList<>();
    static ArrayList<Cake> inventoryCakes = new ArrayList<>();
       
    public static void main(String[] args) {
        
        // Create inventory of 5 cookies
        inventoryCookies.add(new Cookie("Tony's Chocolate Chip Cookies", 48, false));
        inventoryCookies.add(new Cookie("Steve's Nutty Cookies", 36, true));
        inventoryCookies.add(new Cookie("Black Widow's Double Chocolate", 12, false));
        inventoryCookies.add(new Cookie("Nick's Buttery Delights", 48, false));
        inventoryCookies.add(new Cookie("Banner's Bannana Cookies", 60, false));
        
        // Print unsorted list of cookies
        System.out.println(inventoryCookies);
        
        // Sort theinventory array
        Collections.sort(inventoryCookies);
        
        // Print sorted inventory
        System.out.println(inventoryCookies);
        
        // Create inventory of 10 cakes
        inventoryCakes.add(new Cake("Hulk's Cake", 5, Cake.CAKE_TYPE.BIRTHDAY));
        inventoryCakes.add(new Cake("Thor Cake", 3, Cake.CAKE_TYPE.POISONOUS));
        inventoryCakes.add(new Cake("Spider-Man's Amazing Spider Cake", 15, 
                                    Cake.CAKE_TYPE.EROITC));
        inventoryCakes.add(new Cake("Asgard Wedding Cake", 33, Cake.CAKE_TYPE.WEDDING));
        inventoryCakes.add(new Cake("The Patriot Pie", 4, Cake.CAKE_TYPE.BIRTHDAY));
        inventoryCakes.add(new Cake("Hawk Eye Strawberry Cake", 3, 
                                    Cake.CAKE_TYPE.FIRSTKILL));
        inventoryCakes.add(new Cake("Loki's Lemon Meringue", 7, Cake.CAKE_TYPE.BIRTHDAY));
        inventoryCakes.add(new Cake("Ant Hill Cake", 523, Cake.CAKE_TYPE.WEDDING));
        inventoryCakes.add(new Cake("Stark Industries Apple Tart", 5, 
                                   Cake.CAKE_TYPE.EROITC));
        inventoryCakes.add(new Cake("Cake of Ultron", 1, Cake.CAKE_TYPE.POISONOUS));
        
        // Print unsorted list of cakes
        System.out.println(inventoryCakes);
        
        // Sort theinventory array
        Collections.sort(inventoryCakes);
        
        // Print sorted inventory
        System.out.println(inventoryCakes);
        
        // Shuffle array of cakes
        Collections.shuffle(inventoryCakes);
        
        CakeComparator comparator = new CakeComparator();
        
        Collections.sort(inventoryCakes, comparator);
        
        // Print sorted list 
        System.out.println(inventoryCakes);
        
        
        
        /* Used for printing report from version 1
        PrintReport.printHeader();
        PrintReport.createInventory();
        PrintReport.printInventory();
        PrintReport.sellInventory();
        PrintReport.printInventory();
        */

          
    }         

}
