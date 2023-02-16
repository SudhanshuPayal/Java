import java.util.Arrays;
// import java.util.List;
// import java.lang.String;
import java.util.stream.*;
// import java.nio.file.*;
import java.io.IOException;

public class AvgSqrInIntArray
{
    public static void main(String args[]) throws IOException
    {
        Arrays.stream(new int[]{2,4,6,8,10}) 
            .map(x->x*x)
            .average()
            .ifPresent(System.out::println);
    }
}