class Human
{
    private int age=10;
    private String name="sud";

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class PrivateUse
{
    public static void main(String args[])
    {
        Human ob = new Human();
        System.out.println(ob.getName() + " : " + ob.getAge());
    }
}