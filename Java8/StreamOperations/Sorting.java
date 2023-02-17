import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;
public class Sorting
{
    public static void main(String args[])
    {
        //java7 sorting
        List<String> names = PersonRepository.getAllPersons()
            .stream()
            .map(Person::getName)
            .collect(Collectors.toList());

        System.out.println("before sort");
        names.forEach(System.out::println);//even this is java8 feature
        Collections.sort(names);
        System.out.println("after sort");
        names.forEach(System.out::println);
        //java8 sorting
        System.out.println("Natural Order");
        names.sort(Comparator.naturalOrder());
        names.forEach(System.out::println);
        System.out.println("Reverse Order");
        names.sort(Comparator.reverseOrder());
        names.forEach(System.out::println);


       
    }
}