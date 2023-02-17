import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StreamJoining
{
    static String Streamjoin()
    {
        String s = PersonRepository.getAllPersons()
            .stream()
            .map(Person::getName)
            .collect(Collectors.joining());
            // .collect(Collectors.joining("-"));
            // .collect(Collectors.joining("-","[","]"));
            
        return s;
    }
    public static void main(String args[])
    {
        char[] ch={'a','b','c','d','e'};
        String join=Stream.of(ch).map(a->new String(a)).collect(Collectors.joining());
        System.out.println("Joined data: " +join);

        System.out.println("Joining Output:" +Streamjoin());
    }
}
