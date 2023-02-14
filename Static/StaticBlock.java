class Mobile
{
    String brand;
    int price;
    static String name;
    static{ //it will be called first whenever the class is loaded
        name="anything";
        System.out.println("in static block");
    }
    public Mobile()
    {
        brand="";
        price=00;
        System.out.println("in constructor");
    }
    void showData(){
        System.out.println(brand+" : " + price +" : "+name);
    }
}
class StaticBlock
{
    public static void main(String a[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");//used to load the class 
        
        // Mobile ob = new Mobile();
        // ob.brand="apple";
        // ob.price=1000;
        // ob.name="iphone14";

        // Mobile ob2 = new Mobile();
        // ob2.brand="Samsung";
        // ob2.price=800;
        // ob2.name="Galaxy"; 
        
    }
}