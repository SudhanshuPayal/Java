import java.util.*;
import java.util.stream.*;
public class Peek
{
    public static void main(String args[])
    {
        List<String> l=PersonRepository
            .getAllPersons()
            .stream()
            .peek(p -> System.out.println(p))
            .map(Person :: getName)
            .peek(System.out::println)
            .collect(Collectors.toList());

    }
}
