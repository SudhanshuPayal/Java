class Human
{
    private int age;
    private String name;
    public Human ()
    {
        age=12;
        name="Sudhanshu";
        System.out.println("Normal constructor:");
        System.out.println(name + " : " + age);
    }
     public Human (int age,String name)
    {
        System.out.println("Parameterized constructor:");
        System.out.println(name + " : " + age);
    }
}
public class ParaCon
{
    public static void main(String args[])
    {
        Human ob = new Human();
        Human ob2 = new Human(23,"sudh");
        
    }
}