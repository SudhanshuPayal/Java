import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class PredicatePerson
{
    static Predicate<Person> p1= per ->per.getHeight()>=140;
    static Predicate<Person> p2= per ->per.getGender().equals("Male");
    public static void main(String args[])
    {
        List<Person> pl= PersonRepository.getAllPersons();
        pl.stream()
        .filter(p1)
        .collect(Collectors.toList());

        pl.forEach(per -> {
            if(p1.test(per))
            {
                System.out.println(per);
            }
        });
    }
}