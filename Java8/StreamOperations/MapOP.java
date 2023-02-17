import java.util.*;
import java.util.stream.*;
public class MapOP
{
    public static void main(String args[])
    {
        List<String> fruits = Arrays.asList("Apple","Banana","Orange","Pineapple");
        List<Integer> fruit_length = fruits.stream()
            // .map(p -> p.length())
            .map(String :: length) //can use any way
            .collect(Collectors.toList());
        System.out.println("Fruit name Length List : "+fruit_length);

        fruits.stream()
            .map(String :: length) 
            .collect(Collectors.toList()).forEach(System.out::println);
    }
}
