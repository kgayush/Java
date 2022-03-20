import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {  	        // comparator
            public int compare (String s1, String s2) {
                return s1.compareToIgnoreCase(s2);              
            }
        };

        SortedSet<String> s = new TreeSet<String>(comparator);
        for (String a : args) {
            s.add(a);
        }

        System.out.println(s.size() + " distinct words: " + s);
    }
    
}
