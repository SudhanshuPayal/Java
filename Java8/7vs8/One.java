import java.util.stream.*;
public class One
{
    public static void main(String args[])
    {
        //java7
        int total=0;
        for(int i=0;i<50;i++)
        {
            total += i;
        }  
        System.out.println("Total by java 7 is : "+total);

        //java8
        int total2=IntStream.rangeClosed(0,50)
            //.map(Integer :: new) //dont understand it yet 16/02:9/30
            .sum();
        System.out.println("Total by java 8 is : "+total2);
    }
}