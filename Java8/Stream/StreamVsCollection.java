import java.util.*;
import java.util.stream.*;
public class StreamVsCollection
{
    public static void main(String args[])
    {
        //collections
        List<String> names = new ArrayList<String>();
        names.add("Sud");
        names.add("kir");
        names.add("faz");
        names.add("ish");
        names.add("kar");
        names.add("ank");
        for(String name:names)
        {
            System.out.println("C:"+name);
        }

        //streams
        Stream<String> s1=names.stream();
        s1.forEach(p-> System.out.println("S:"+p));
        
    }
}
