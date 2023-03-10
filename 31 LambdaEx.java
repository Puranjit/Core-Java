// A functional interface is an interface that consists of only one method
@FunctionalInterface
interface A {
    void show();
}

interface B {
    int add(int i, int j);
}
// We could avoid creating sub-class by defining anonymous inner class in main

// class B implements A {
// public void show() {
// System.out.println("In show.....");
// }
// }

public class LambdaEx {
    public static void main(String[] args) {

        // Instantiating A using an anonymous-inner class
        A a = new A() {
            public void show() {
                System.out.println("In show in Ann. Inner class");
            }
        };
        a.show();

        // Lambda expressions can only be used with functional interfaces in Java
        // Implementation of a Lambda expression

        A a1 = () -> System.out.println("In show in Lambda exp.");
        a1.show();

        // So we reduced the code of lines19-24 to only 29-30

        // Implementing a method that returns a value using Ann Inner class

        B b = new B() {
            public int add(int i, int j) {
                return i + j;
            }
        };
        int res = b.add(5, 4);
        System.out.println(res);

        // Implementing a method that returns a value as a lambda expression

        B b1 = (i, j) -> i + j;
        int res1 = b.add(5, 4);
        System.out.println(res1);
    }
}
