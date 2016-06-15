package javabakery;

/**
 * Cookie represents a cookie and are only sold by the dozen
 */
public class Cookie extends BakedGood implements Comparable<Cookie>{
    
    // constant class variable
    private static final int DOZEN_COUNT = 12;
    
    // Instance variables
    private boolean nuts;   // does cake contain nuts?
    
    // Instance methods 
    
    // Constructors
    
    public Cookie(String name, int count) {
        super(name, count);
    }
    
    public Cookie(String name, int count, boolean nuts){
        this(name, count);
        this.nuts = nuts;
    }
    
    // Getters and setters

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    // toString
    
    public String toString() {
        String result = "";
        
        if (hasNuts()) {
            result = super.toString() + " (Has Nuts, " + (count / DOZEN_COUNT) + " dozen"
                    + " cookies)";
        } else {
            result = super.toString() + " (No Nuts, " + (count / DOZEN_COUNT) + " dozen"
                    + " cookies)";
        }
        
        return result;
    } 
    
    // Other instance methods
    
    public boolean hasNuts() {
        return this.nuts;
    }
    
    
    @Override
    public void sell(int dozen) {
        
        count = count - (dozen * DOZEN_COUNT);   // update item count 
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
    public int compareTo(Cookie c) {
        return this.name.compareTo(c.name);
    }
    
}
