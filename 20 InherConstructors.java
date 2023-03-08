// Parent class
class A extends Object {

    // Default constructor
    A() {
        super(); // This command is always initiated when we define any constructor (Default/
                 // Parametrized) in a class
        System.out.println("in A"); // Default constructor
    }

    // Parametrized constructor
    A(int n) {
        super();
        System.out.println("in A int"); // Parametrized constructor
    }
}

// Child class
class B extends A {

    // Default constructor
    B() {
        super();
        System.out.println("in B"); // Default constructor
    }

    // Parametrized constructor
    B(int n) {
        this(); // This commands call the default constructor in parent and all the constructor
                // in child class
        System.out.println("in B int"); // Parametrized constructor
    }
}

public class InherConstructors {

    public static void main(String args[]) {

        B b = new B(6);
    }

}
