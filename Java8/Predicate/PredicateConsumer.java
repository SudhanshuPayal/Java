import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class PredicateConsumer
{
    static Predicate<Person> p1= per ->per.getHeight()>=140;
    static Predicate<Person> p2= per ->per.getGender().equals("Male");
    static BiConsumer<String,List<String>> pc = (name,hobbies)->System.out.println(name+" : "+hobbies);
    static Consumer<Person> percon = per ->{
        if(p1.and(p2).test(per))
        {
            pc.accept(per.getName(),per.getHobbies());
        }
    };
    public static void main(String args[])
    {
        List<Person> pl= PersonRepository.getAllPersons();
        pl.forEach(percon);
    }
}