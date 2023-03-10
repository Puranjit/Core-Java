// Abstract class
abstract class Rapid {
    abstract public void drive();
}

// Abstract class
abstract class Octavia extends Rapid {
    abstract public void tyres();
}

// Concrete class - in which all the methods are defined using the concept --
// OverRiding
class Skoda extends Octavia {

    public void drive() {
        System.out.println("The drive is very good!!");
    }

    public void tyres() {
        System.out.println("The company uses Michelin tyres in new cars!!");
    }

}

public class AbstractClass {

    public static void main(String[] args) {

        // We always use the concrete class as an object to define the instance in the
        // main method
        // We cannot instantiate an abstract class - always use a constructor class 
        // as the object while instantiating a class 
        
        Octavia sk = new Skoda();
        sk.drive(); // method @overriding in Skoda class
        sk.tyres(); // method @overriding in Skoda class
    }

}
