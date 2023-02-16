class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
     
}
public class UpcastingDowncasting
{
    public static void main(String args[])
    {
        A ob1 =(A) new B(); //upcasting
        ob1.show();
        
        B ob2=(B) ob1; //downcasting
        ob2.show2();
    }
}