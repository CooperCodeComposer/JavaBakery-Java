package javabakery;

/**
 * BakedGood represents a generic baked good.
 */
public abstract class BakedGood {
    
    // Instance variables
    protected int id;           // item id
    protected String name;      // item name
    protected int count;        // number of items
    
    // Class variables
    private static int lastAsignedId = 100; // last id assigned to an object
    
    // Instance methods 
    
    // Constructors
    public BakedGood() {
        this.id = lastAsignedId;  
        lastAsignedId++;
    }
    
    public BakedGood(String name, int count){
        this();
        this.name = name;
        this.count = count;
    }
    
    // Getters / setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    // toString method
    
    public String toString() {
        return "[" + id + "] " + name;
    }
    
    // sell abstract method
    
    public abstract void sell(int num);
    
    
      
}
