class Mobile
{
    String brand;
    int price;
    static String name;
    void showData(){
        System.out.println(brand+" : " + price +" : "+name);
    }
}
class StaticKeyword
{
    public static void main(String a[])
    {
        Mobile ob = new Mobile();
        ob.brand="apple";
        ob.price=1000;
        //ob.name="iphone14";    //we can use this line but its goof practice to use below line
        Mobile.name="iphone14";
        Mobile ob2 = new Mobile();
        ob2.brand="Samsung";
        ob2.price=800;
        Mobile.name="Galaxy"; 
        Mobile.name="Phone";
        //now as the name is static that means we will be using same copy for all the 
        //objects so thats why changing name here will make changes in previous object 
        //as the same copy are being shared by both the objects
        
        ob.showData();
        ob2.showData();
    }
}