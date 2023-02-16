interface I1
{
    public void hello();
}
interface I2
{
    public void sqr(int m);
}
interface I3
{
    public int cube(int n);
}
public class LambdaSimple
{
    public static void main(String args[])
    {
        
        // public void hi()
        // {
        //     System.out.println("hi");
        // }
        I1 ob = () -> System.out.println("hi");
        ob.hello();

        
        // public void sqr(int n)
        // {
        //     System.out.println(n*n);
        // }
        //(n)->System.out.println(n*n);
        I2 ob2 = m -> System.out.println(m*m);
        ob2.sqr(5);
        ob2.sqr(15);
        // public void cube(int n)
        // {
        //     return n*n*n;
        // }
        // (n)->{return n*n*n;};
        // (n)->n*n*n;
        I3 ob3 = n -> n*n*n;
        int r=ob3.cube(8);
        System.out.println(r);

    }
}