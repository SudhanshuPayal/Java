import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class IntStreamWithSkip
{
    public static void main(String args[]) throws IOException
    {
        IntStream
            .range(1,10)
            .skip(5)
            .forEach(x -> System.out.println(x));
        System.out.println();
    }
}