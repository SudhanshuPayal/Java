import java.util.*;
import java.util.stream.*;
public class BasicStream
{
    public static void main(String args[])
    {
        Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
        s1.forEach(p-> System.out.println(p));
        Stream<Integer> s2 = Stream.of(new Integer[]{1,2,3,4,5,6,7,8});
        s2.forEach(p-> System.out.println(p));
    }
}
