import java.util.Arrays;
import java.util.List;
// import java.lang.String;
import java.util.stream.*;
// import java.nio.file.*;
import java.io.IOException;

public class StreamFromList
{
    public static void main(String args[]) throws IOException
    {
        List<String> people= Arrays.asList("AL","ANKIT","KUSHAL","BRENT","SARIKA","AMANDA","HANA","SHIVIKA");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x->x.startsWith("a"))
            .forEach(System.out::println);
    }
}