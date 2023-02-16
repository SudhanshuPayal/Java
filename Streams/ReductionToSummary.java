import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class ReductionToSummary
{
    public static void main(String args[]) throws IOException
    {
        IntSummaryStatistics summary =IntStream.of(1,2,19,88,73,4,10)
            .summaryStatistics();
            System.out.println(summary);
    }
}