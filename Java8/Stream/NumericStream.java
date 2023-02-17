import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class NumericStream
{
    static BinaryOperator<Integer> bo = (x,y) -> x+y;
    static int calculateSum(List<Integer> l)
    {
        return l.stream().reduce(0,bo);
    }
    static int calculateSumWithNumericStream(IntStream i)
    {
        return i.sum();
    }
    static int calculateSumWithNumericStream2(IntStream i)
    {
        return i.sum();
    }
    public static void main(String args[])
    {
        List<Integer> l =Arrays.asList(4,5,6,7,8,9);
        System.out.println("Total using normal Stream:"+calculateSum(l));

        IntStream i=IntStream.rangeClosed(1,6);
        System.out.println("Total using IntStream:"+calculateSumWithNumericStream(i));

        IntStream i2=IntStream.range(1,6);
        System.out.println("Total using IntStream:"+calculateSumWithNumericStream2(i2));
        //the differnce between range and rangeClosed is that 
        //rangeclosed(1,6) will take even the 6 in calculation but
        //range(1,6) will take only till 5 and not take 6 
    }
}
