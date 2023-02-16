import java.util.Arrays;
// import java.util.List;
// import java.lang.String;
import java.util.stream.*;
// import java.nio.file.*;
import java.io.IOException;

public class StreamFromArray
{
    public static void main(String args[]) throws IOException
    {
        String[] names={"AL","ANKIT","KUSHAL","BRENT","SARIKA","AMANDA","HANA","SHIVIKA"};
        Arrays.stream(names) //same as Stream.of(names)
            .filter(x -> x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);
    }
}