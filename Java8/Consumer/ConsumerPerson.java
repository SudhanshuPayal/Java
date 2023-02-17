import java.util.function.*;
import java.util.*;
public class ConsumerPerson
{
    static Consumer<Person> c1 = p->System.out.println(p);
    static Consumer<Person> c2 =(p)->System.out.println(p.getName().toUpperCase());
    static Consumer<Person> c3 =(p)->System.out.println(p.getHobbies());
    static void printNameAndHobbies()
   {
        List<Person> personList=PersonRepository.getAllPersons();
        personList.forEach(c1.andThen(c2));
   } 
   static void printWithConditions()
   {
        List<Person> personList=PersonRepository.getAllPersons();
        personList.forEach(p -> {
            if(p.getGender().equals("Male"))
            c2.andThen(c3).accept(p);
        });
   }
    public static void main(String args[])
    {
        // c1.accept(PersonRepository.getPerson());
        // c2.accept(PersonRepository.getPerson());
        // c3.accept(PersonRepository.getPerson());
        //instead of above three lines we can use 
        //c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());

        //printNameAndHobbies();
        printWithConditions();

    }
}