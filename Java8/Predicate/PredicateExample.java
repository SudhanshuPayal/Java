import java.util.function.*;
public class PredicateExample
{
    public static void main(String args[])
    {
        Predicate<Integer> lt = a -> (a>=50);
        boolean r=lt.test(150);
        System.out.println(r);
    }
}