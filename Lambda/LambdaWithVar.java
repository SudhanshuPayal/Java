@FunctionalInterface
interface In
{
    void add(int n);
}
public class LambdaWithVar
{
    public static void main(String args[])
    {
        In ob =(int i) -> System.out.println("in show "+i);
        // In ob =(i) -> System.out.println("in show"+i);
        // In ob =i -> System.out.println("in show"+i);
        //all works
        ob.show(5);
    }
}