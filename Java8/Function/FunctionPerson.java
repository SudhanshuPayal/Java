import java.util.function.*;
import java.util.*;
public class FunctionPerson
{
    static Function<String,Integer> f1=name->name.length();
    static Function<List<Person>,Map<String,Double>> f2= perlist ->{
        Map<String,Double> map =new HashMap<String,Double>();
        perlist.forEach(per->{
            
            map.put(per.getName(),per.getSalary());
        });
        return map;
    };
    public static void main(String args[])
    {
        List<Person> personList=PersonRepository.getAllPersons();
        Map<String,Double> map = f2.apply(personList);
        System.out.println("Result"+map);

    }
}