import java.util.function.*;
public class FunctionExample
{
    static Function<String,String> f1= name -> name.toUpperCase();
    static Function<String,String> f2= name -> name.concat("Payal");

    public static void main(String args[])
    {
        System.out.println("Result 1: "+f1.apply("Sudhanshu "));
        System.out.println("Result 2: "+f2.apply("Sudhanshu "));
        //instead of these above two lines we can use
        System.out.println("Result of andThen: "+f1.andThen(f2).apply("Sudhanshu "));
        System.out.println("Result of compose:" +f1.compose(f2).apply("Sud"));
        //compose takes f2 and passes it to f1 while andThen takes f1 and passes to f2

        
    }
}