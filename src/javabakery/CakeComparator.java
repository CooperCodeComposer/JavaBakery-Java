package javabakery;

import java.util.Comparator;

public class CakeComparator implements Comparator<Cake>{
    
    @Override
    public int compare(Cake c1, Cake c2) {
        int result = c1.type.compareTo(c2.type);
        if (result != 0) {
            return result;
        }
        return c1.name.compareTo(c2.name);
    }
    
}
