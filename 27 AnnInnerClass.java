class A {
    public void show() {
        System.out.println("Hello hello..");
    }
}

// Creating an abstract class
abstract class C {

    // Creating abstract method - defined in the main method
    public abstract void show();

    public abstract void config();
}

public class AnnInnerClass {

    public static void main(String[] args) {

        A a1 = new A();
        a1.show();

        // Definig an annonymous inner class
        // We will see that now the show() method is over ridden in the main method
        A a2 = new A() {
            public void show() {
                System.out.println("Annonymous Inner class");
            }
        };

        a2.show();

        C c = new C() {
            public void show() {
                System.out.println("Abstract Annonymous inner class method show()");
            }

            public void config() {
                System.out.println("Abstract Annonymous inner class method Config()");
            }
        };

        c.show();
        c.config();
    }
}
