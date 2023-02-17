import java.util.function.*;
public class MethodReference
{
    static Function<String,String> f1= name -> name.toUpperCase();//lambda Exp
    static Function<String,String> f2= String :: toUpperCase; //method reference
    //method reference is used as -> Class_name::Method_name;
    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = MethodReference::heightCheck;
    static BiPredicate<Person ,Integer> p3 = MethodReference::heightCheck2;
    public static void main(String args[])
    {
        System.out.println("Result 1: "+f1.apply("Sudhanshu "));
        System.out.println("Result 2: "+f2.apply("Payal "));

        System.out.println("Predicate Result 1: "+p1.test(PersonRepository.getPerson()));
        System.out.println("Predicate Result 1: "+p2.test(PersonRepository.getPerson()));
        System.out.println("Predicate Result 1: "+p3.test(PersonRepository.getPerson(),180));


    }
    static boolean heightCheck(Person per)
    {
        return per.getHeight()>=140;
    }
    static boolean heightCheck2(Person per,Integer height)
    {
        return per.getHeight()>= height;
    }
}