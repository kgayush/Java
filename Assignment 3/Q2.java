// Count the number of words using HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String str;                                 // getting input
        System.out.println("Write a statement:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");                    // splitting the word after every space

        for (String word : words) {
            Integer key = hashMap.get(word);
            if (key == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, key + 1);
            }
        }
        System.out.println(hashMap);

    }
    
}
