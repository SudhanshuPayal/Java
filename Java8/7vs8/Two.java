import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Two
{
    public static void main(String args[])
    {
        //java7
        List<String> names = Arrays.asList("Sam","Peter","Bill","Sam");
        List<String> uniq_list= new ArrayList();
        for(String name :names)
        {
            if(!uniq_list.contains(name))
            {
                uniq_list.add(name);
            }
        }
        System.out.println("Unique by java 7 is : "+uniq_list);

        //java8
        List<String> uniq_list2 =names.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Unique by java 8 is : "+uniq_list2);
    }
}