package javabakery;

/**
 * Cake represents a cake and extends BakedGood
 */
public class Cake extends BakedGood implements Comparable<Cake> {
    
    // Instance variables
    protected CAKE_TYPE type;
    
    // Class variables
    public static enum CAKE_TYPE { BIRTHDAY, 
                                   WEDDING,
                                   POISONOUS,
                                   EROITC,
                                   FIRSTKILL}
    
    // Instance methods 
    // Constructors
    
    public Cake(String name, int count) {
        super(name, count);
    }
    
    public Cake(String name, int count, CAKE_TYPE type){
        this(name, count);
        this.type = type;
    }
    
    // Sell method
    
    @Override
    public void sell(int num) {
        count = count - num;   // update item count 
    }
    
    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BakedGood that = (BakedGood) obj;
        return this.name.equals(that.name);
    }
    
    // Compare To method
    @Override
    public int compareTo(Cake c) {
        return this.name.compareTo(c.name);
    }
    
    // Getters and setters

    public CAKE_TYPE getType() {
        return type;
    }

    public void setType(CAKE_TYPE type) {
        this.type = type;
    }
    
    // toString
    
    public String toString() {
        return super.toString() + " (" + type + ", " + count + " cakes)";
    } 
   
}
