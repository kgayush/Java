// First non repeating character

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);                   
        String input = sc.nextLine();
        Character firstNonRepeatedChar = firstNonRepeating(input);
        System.out.println("The first non repeated character is: " + firstNonRepeatedChar);
        sc.close();
    }

    private static Character firstNonRepeating(String input) {  
        Character result =  input.chars()                                             //string stream
             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))      //convert to lowercase & then to Character object
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
             .entrySet().stream()
             .filter(entry -> entry.getValue() == 1L)
             .map(entry -> entry.getKey())
             .findFirst().get();
        
         return result;    
  }
}
