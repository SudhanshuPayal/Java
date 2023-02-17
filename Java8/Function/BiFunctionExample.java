import java.util.function.*;
public class BiFunctionExample
{
    static BiFunction<String,String,String> bf1= (a,b) ->(a+" : " +b);


    public static void main(String args[])
    {
        String str=bf1.apply("Sudhanshu","Payal");
        System.out.println(str);
    }
}