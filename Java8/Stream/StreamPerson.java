import java.util.*;
import java.util.stream.*;
public class StreamPerson
{
    public static void main(String args[])
    {
        Map<String,List<String>> pmap = PersonRepository
            .getAllPersons()//iterating all persons
            .stream()//Streamof Persons
            .collect(Collectors
                .toMap(Person::getName,Person::getHobbies));
        System.out.println("Person Map: "+pmap);
        List<String> person_all_hobbies =PersonRepository
            .getAllPersons()//list of all persons with details
            .stream() //Stream of persons with details
            .map(Person::getHobbies) //Stream<List<String>>
            .flatMap(List::stream)//Stream<String>
            .distinct()//unique values filtered
            .collect(Collectors.toList());//collection to be returned
        System.out.println("List of all Hobbies : "+person_all_hobbies);
        
    }
}
