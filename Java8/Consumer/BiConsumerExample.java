import java.util.function.*;
public class BiConsumerExample
{
    public static void main(String args[])
    {
        BiConsumer<Integer , Integer> bc1 =(a,b)->System.out.println("add is: "+(a+b));
        bc1.accept(10,20);
        // Consumer<String> con2 =(s)->System.out.println(s.toLowerCase());
        // con2.accept("JAVA8");
        // con1.andThen(con2).accept("JaVa8");
    }
}