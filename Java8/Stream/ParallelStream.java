import java.util.*;
//import java.time.*;
import java.util.stream.*;
public class ParallelStream
{
    public static void main(String args[])
    {
        String str[]={"1","2","3","4","5","6","7","8","9","0"};
        System.out.println("Sequential Run---");
        printStream(Arrays.stream(str).sequential());//by default stream is sequential
        System.out.println("Parallel Run---");
        printStream(Arrays.stream(str).parallel());
    }
    static void printStream(Stream<String> stream)
    {
        stream.forEach(s->{System.out.println("Value :" +s+"Thread:"+Thread.currentThread().getName());
        try{
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    });
    }
    static int sumMethodUsingSeq()
    {
        return 0;
    }
}
