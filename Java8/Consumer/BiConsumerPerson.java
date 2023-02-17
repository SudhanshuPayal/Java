import java.util.function.*;
import java.util.*;
public class BiConsumerPerson
{
    static void printPersonalDetails()
   {
        BiConsumer<String,List<String>> pc = (name,hobbies)->System.out.println(name+" : "+hobbies);
        List<Person> personList=PersonRepository.getAllPersons();
        personList.forEach(per -> pc.accept(per.getName(),per.getHobbies()));
   } 
    public static void main(String args[])
    {
        printPersonalDetails();
    }
}