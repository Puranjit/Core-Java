// class > class: extends
// interface > class: implements
// interface> interface: extends

// Defining an interface
interface A {

    // All the variables declared in interface are static and final
    String name = "Puran";
    int score = 45;

    // Al; the method in interface have the ('public abstract') heading by default
    void show();

    void aim();
}

interface B {
    void run();
}

interface C extends B {

}

// All the method in the interface needs to be defined in the sub/child class
// otherwise that class is automatically converted into an abstract class
class D implements A, C {

    public void aim() {
        System.out.println("Aim is to learn JAVA..");
    }

    public void show() {
        System.out.println("Show the resultzz..");

    }

    public void run() {
        System.out.println("The code is running...");
    }
}

public class Interface {
    public static void main(String[] args) {

        A obj1 = new D();
        obj1.aim();
        obj1.show();

        C obj2 = new D();
        obj2.run();

        // The variables from interface can be directly called using the interface name
        System.out.println(A.name);
        System.out.println(A.score);
    }
}
