import java.util.*;

public class Q3 {

    // trim method

    static void listTrim(List<String> strings) {
        for (ListIterator<String> myListIterator = strings.listIterator(); myListIterator.hasNext();) {
            myListIterator.set(myListIterator.next().trim());                               
        }
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("triangle", "square", "circle");        // list 
        listTrim(myList);
        for (String s : myList) {
            System.out.format("\"%s\"%n", s);
        }
    }
    
}
