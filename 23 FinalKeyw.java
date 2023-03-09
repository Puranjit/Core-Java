// This code explains the uses of final keyword when defined as a variable, method, and class

class Calc {

    public final void show() {
        System.out.println("Code by Puran");
    }

    public void add(int n1, int n2) {
        // return n1 + n2;
        System.out.println(n1 + n2);
    }
}

class advCalc extends Calc {
    // Error message that - Cannot over ride a final method from parent class
    // public void show() {
    // System.out.println("Code by Jogi");
    // }

}

// final class - has the property that no other class can inherit it
final class B {
    B() {
        System.out.print("Hello World....");
    }
}

// We can not create B as a parent class for C as it is defined as a final class
// class C extends B{

// }

public class FinalKeyw {
    public static void main(String args[]) {

        // Defining a final variable
        final double pi = 3.14; // We cannot update the value of variable pii in future // CONSTANT

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 7);

    }
}
