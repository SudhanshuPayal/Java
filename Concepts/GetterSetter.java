class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class GetterSetter
{
    public static void main(String args[])
    {
        Human ob = new Human();
        ob.setAge(30);
        ob.setName("Sudhanshu");
        System.out.println(ob.getName() + " : " + ob.getAge());
    }
}