// This code explains the concept of run-time PolyMorphism - Dynamic Method Dispatch

// Super class
class A {

    public void show() {
        System.out.println("running in A");
    }

}

// sub-class
class B extends A {
    // Over-riding method show
    public void show() {
        System.out.println("running in B");
    }
}

// sub-class
class C extends A {
    // Over-riding method show
    public void show() {
        System.out.println("running in C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String args[]) {

        // We created an instance for class A
        A obj = new A();
        obj.show();

        // We updated the old variable with new object B
        obj = new B();
        obj.show();

        // We updated the old variable with new object C
        obj = new C();
        obj.show();
    }
}
