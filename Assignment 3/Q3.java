// Iterate ArrayList

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a", "b", "c", "d", "e");           // List
        
        for (int i = 0; i < myList.size(); i++) {                               // For loop
            System.out.print(myList.get(i) + " ");  
        }                                
            
        System.out.println("\n");

        int i = 0;
        while (i < myList.size()) {                                             // While loop
            System.out.print(myList.get(i++) + " ");
        }       
        
        System.out.println("\n");
        
        for (String str : myList) {                                             // Advance for loop
            System.out.print(str + " ");
        }                                        
    }
    
}
