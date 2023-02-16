//import java.util.Arrays;
//import java.util.List;
//import java.lang.String;
import java.util.stream.*;
//import java.nio.file.*;
import java.io.IOException;

public class IntStreamWithSum
{
    public static void main(String args[]) throws IOException
    {
        System.out.println(
        IntStream
            .range(1,10)
            .sum());
        System.out.println();
    }
}