import java.util.function.*;
public class FunctionUse
{
    public static void main(String args[])
    {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(10));
        System.out.println(f.apply(11));  
    }
}