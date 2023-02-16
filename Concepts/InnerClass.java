class AA
{
    int a;
    public void show()
    {
        System.out.println("in A show");
    }

class BB 
{
    public void show2()
    {
        System.out.println("In B show");
    }
     
}
}
public class InnerClass
{
    public static void main(String args[])
    {
        AA ob1 = new AA();
        ob1.show();
        
        AA.BB ob2=ob1.new BB(); 
        ob2.show2();
    }
}