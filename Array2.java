import java.util.*;
import java.lang.*;

public class Array2 {
    public static void main(String[] agrs){
       ArrayList <ArrayList<String>> All = new ArrayList<>();

        ArrayList<String> Numbers = new ArrayList<>();
        Numbers.add("2023");
        Numbers.add("2022");
        Numbers.add("2021");

        ArrayList<String> Letters = new ArrayList<>();
        Letters.add("first");
        Letters.add("Second");
        Letters.add("Third");

        ArrayList<String> Color = new ArrayList<>();
        Color.add("Green");
        Color.add("Blue");
        Color.add("Yellow");

        All.add(Numbers);
        All.add(Letters);
        All.add(Color);

        System.out.println(Numbers);
        System.out.println(Letters);
        System.out.println(Color);

    }
}
