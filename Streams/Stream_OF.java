// import java.util.Arrays;
// import java.util.List;
// import java.lang.String;
import java.util.stream.*;
// import java.nio.file.*;
import java.io.IOException;

public class Stream_OF
{
    public static void main(String args[]) throws IOException
    {
        Stream.of("Ava","Aneri","Alberto")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);
        
    }
}