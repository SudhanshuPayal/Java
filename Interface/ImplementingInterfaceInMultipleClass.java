interface I
{
    void show();
    void noshow();
}
class A implements I
{
    public void show()
    {
        System.out.println("in A show");
    }
    public void noshow()
    {
        System.out.println("in A noshow");
    }
}
class B implements I
{
    public void show()
    {
        System.out.println("in B show");
    }
    public void noshow()
    {
        System.out.println("in B noshow");
    }
}
public class ImplementingInterfaceInMultipleClass
{
    public static void main(String args[])
    {
        A ob = new A();
        B ob2 =new B();
        ob2.show();
        ob2.noshow();
        ob.show();
        ob.noshow();
        
    }
}