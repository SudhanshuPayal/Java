interface I
{
    //all variables in interface are by default final and static
    int f=10;
    //all methods in interface are by default public and abstract
    void show();
    void noshow();
}
class A implements I
{
    public void show()
    {
        System.out.println("in show");
    }
    public void noshow()
    {
        System.out.println("in noshow");
    }
}
public class InterfaceUse
{
    public static void main(String args[])
    {
        A ob = new A();
        ob.show();
        ob.noshow();
        
    }
}