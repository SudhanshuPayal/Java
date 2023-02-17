import java.util.*;
import java.util.stream.*;
public class MapOP2
{
    static List<String> toUpperMethod(List<Person> lp)
    {
        return lp.stream()
                    .map(Person::getName)
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
    }
    static Set<String> toUpperMethodSet(List<Person> lp)
    {
        return lp.stream()
                    .map(Person::getName)
                    .map(String::toUpperCase)
                    .collect(Collectors.toSet());
    }
    public static void main(String args[])
    {
        System.out.println("Name list in CAP using List:" + toUpperMethod(PersonRepository.getAllPersons()));
        System.out.println("Name list in CAP using Set:" + toUpperMethodSet(PersonRepository.getAllPersons()));

    }
}
