class Mobile
{
    String brand;
    int price;
    static String name;
    public void showData(){
        System.out.println(brand+" : " + price +" : "+name);
    }
    public static void show()
    {
        System.out.println("in static Method");
    }
}
class StaticMethod
{
    public static void main(String a[])
    {
        Mobile ob1 = new Mobile();
        ob1.brand="apple";
        ob1.price=1000;
        //ob.name="iphone14";    //we can use this line but its goof practice to use below line
        Mobile.name="iphone14";
        Mobile ob2 = new Mobile();
        ob2.brand="Samsung";
        ob2.price=800;
        Mobile.name="Galaxy"; 
    
        Mobile.name="Phone";
        ob1.showData();
        ob2.showData();
        //Mobile.showData(); //cannot use it as its normal method and normal methods are 
                            //called by objects
        
        Mobile.show();//can call it as its static method
    }
}