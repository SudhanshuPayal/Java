import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class IntStreamRange
{
    public static void main(String args[]) throws IOException
    {
        IntStream
            .range(1,10)
            .forEach(System.out::print);
        System.out.println();
    }
}