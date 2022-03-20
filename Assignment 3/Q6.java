// First repeated character in a string

import java.util.*;

public class Q6 {
    	
	static char firstRepeating(char str[])
	{
		HashSet<Character> h = new HashSet<>();     // Creates an empty hashset

		for (int i=0; i<=str.length-1; i++) {     // Traverse the input array from left to right
		    char c = str[i];

			if (h.contains(c))          // If element is already in hash set, update x and then break
				return c;

			else                        // Else add element to hash set
				h.add(c);
		}

		return '\0';
	}

	public static void main (String[] args)
	{
		String str;
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sc.close();
		char[] arr = str.toCharArray();
		System.out.println(firstRepeating(arr));
	}
}
