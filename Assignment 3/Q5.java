// Second largest in an array

import java.util.Arrays;

public class Q5 {
    public static int secondLargest(int[] arr) {  
        int length = arr.length;
        Arrays.sort(arr);                   // Sorting the array in ascending order
        return arr[length-2];               // returning the element at 2nd last index
        }  
        public static void main(String args[]){  
        int arr[]={1,2,5,6,3,2};    
        System.out.println("Second Largest: "+secondLargest(arr));    
    }
    
}
