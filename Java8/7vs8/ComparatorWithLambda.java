import java.util.*;
import java.util.stream.*;
public class ComparatorWithLambda
{
    public static void main(String args[])
    {
        //java7
        Comparator<Integer> c1= new Comparator<Integer>()
        {
            public int compare(Integer x,Integer y)
            {
                return x.compareTo(y);
            }
        };
        System.out.println("Comparator using java7: "+c1.compare(15,25));

        //java8

        Comparator<Integer> c = (m,n) -> m.compareTo(n);
        System.out.println("Comparator using java8: "+c.compare(35,25));
    }
}