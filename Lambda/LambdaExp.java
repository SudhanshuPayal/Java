@FunctionalInterface
interface I
{
    void show();
}
public class LambdaExp
{
    public static void main(String args[])
    {
        // I ob=new I()
        // {
        //     public void show()
        //     {
        //         System.out.println("in show");
        //     }
        // };
        //this above commented code can be written with the help of lambda as
        I ob =() -> System.out.println("in show");
        ob.show();
    }
}