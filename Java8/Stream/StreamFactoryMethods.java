import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StreamFactoryMethods
{
    static UnaryOperator<Integer> add = x -> x+5;
    
    public static void main(String args[])
    {
        Stream<Integer> s1=Stream.iterate(0,add).limit(10);//limit because it gives infinite
        s1.forEach(System.out::println);
        
        Stream<Double> s2 = Stream.generate(Math::random).limit(10);
        s2.forEach(System.out::println);

        Stream.generate(new Random() :: nextInt).limit(10).forEach(System.out::println);

        Stream<String> s3 = Stream.of("One","Two","Three","Four");
        s3.forEach(System.out::println);
    }
}
