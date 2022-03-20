import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        List<String> argList = Arrays.asList("a", "b", "c", "d", "e");         // List of arguments

        Collections.shuffle(argList);                       // randomly shuffle the list of arguments 

        argList.stream().forEach(e->System.out.format("%s ",e));      // print using stream for statement

        System.out.println();

        for (String arg: argList) {                      // print using traditional enhanced for statement
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}

