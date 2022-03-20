import java.util.Scanner;

// Find Duplicate characters in a string 

public class Q4 {
    public static void main(String[] args) {
        String str;  
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
        int count;  
          
        //Converts given string into character array 

        char string[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: "); 

        //Counts each character present in the string  

        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;   
                    string[j] = '0';                //Set string[j] to 0 to avoid printing visited character
                }  
            }  

            //A character is considered as duplicate if count is greater than 1  

            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        } 
    }
    
}
