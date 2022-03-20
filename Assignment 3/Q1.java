// Iterate HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        HashMap<Integer, String> Mymap = new HashMap<Integer, String>();
        Mymap.put(1, "A");                                                  // storing key value pair in map.
        Mymap.put(2, "B");
        Mymap.put(3, "C");
        Mymap.put(4, "D");
        Mymap.put(5, "E");

        Iterator iterator = Mymap.entrySet().iterator();

        while (iterator.hasNext()) {                                    // while loop
            Map.Entry myMapEntry = (Map.Entry) iterator.next();
            System.out.println("Key: "+myMapEntry.getKey() + ", Value: " + myMapEntry.getValue());
        }

        for (Map.Entry myMapEntry : Mymap.entrySet()) {                 // advance for loop
            System.out.println("Key: "+myMapEntry.getKey() + ", Value: " + myMapEntry.getValue());
        }
    }
}
