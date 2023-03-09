// Super class
class A {

    public void show1() {
        System.out.println("in A show");
    }
}

// Sub class
class B extends A {

    public void show2() {
        System.out.println("in B show");
    }
}

public class UpDownCast {

    public static void main(String args[]) {

        // here A is the reference part and A() is the object class
        A a1 = new A();
        a1.show1();

        // We are creating an object of B using
        a1 = new B(); // implicitly Up-casting
        a1.show1();

        // object of B but type A
        A a2 = (A) new B(); // Up-casting -- Parent to Child
        a2.show1();

        // Type conversion A to B
        B b = new B();
        b = (B) a1; // Down-casting -- Child to Parent
        b.show2();

    }

}
