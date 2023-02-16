@FunctionalInterface
interface Inter
{
    int add(int i,int j);
}
public class LambdaWithReturn
{
    public static void main(String args[])
    {
        Inter ob =(int i,int j) -> i+j; 
        int res=ob.add(5,9);
        System.out.println(res);
    }
}