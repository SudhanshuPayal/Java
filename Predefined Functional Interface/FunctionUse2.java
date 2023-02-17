import java.util.function.*;
public class FunctionUse2
{
    public static void main(String args[])
    {
        Function<String,Integer> f = s->s.length();
        System.out.println(f.apply("sudhanshu"));
        System.out.println(f.apply("dajdskndhkjdasjdklj"));  
    }
}