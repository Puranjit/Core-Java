class Mobile{

    // Defining instance variables
    String name;
    int price;
    static String type;

    // Defining static block
    static{
        System.out.println("In static block!!");
    }
        
    // instance method
    public void show(){
        System.out.println("The name of the mobile is: " + name + ", the price is: " + price + " and type is: " + type);
    }

    // Static method
    public static void show1(Mobile obj){
        System.out.println("In static method!!");
        System.out.println("The name of the mobile is: " + obj.name + ", the price is: " + obj.price + " and type is: " + obj.type);
    }
}

public class Staticc{

    public static void main(String args[]){

        Mobile obj1 = new Mobile();
        obj1.name = "Apple";
        obj1.price = 1500;
        // obj1.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.name = "Samsung";
        obj2.price = 16500;
        // obj2.type = "SmartPhone";

        // obj1.type = "Phone"; // We see that after we compile and run this code, the type value for both the instances are updated

        // Also static variables defined in the class should be updated using the class name while defining instance in the main function
        // We need to define a static variable once or otherwise it gets updated for all instances of the class if defined multiple times

        // Advised way to define a static variable
        Mobile.type = "SmartPhone";

        obj1.show();
        obj2.show();

        // Also we can call the static method of the class without even instantiating the class using the following command
        // Class.forName("Mobile");

        Mobile.show1(obj1);
    }
}