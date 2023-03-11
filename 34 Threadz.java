// We could either extend the Thread class or implement 
// Runnable Functional Interface to implement threads

// class A extends Thread {

// class A implements Runnable {

//     public void run() {
//         for (int i = 1; i <= 100; i++)
//             System.out.println("Hi");
//         try {
//             Thread.sleep(125);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// class B implements Runnable {
//     // class B extends Thread {

//     public void run() {
//         for (int i = 1; i <= 100; i++)
//             System.out.println("Hello");
//         try {
//             Thread.sleep(125);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

public class Threadz {
    public static void main(String[] args) {

        // A a = new A();
        // B b = new B();

        // a.start();
        // try {
        // Thread.sleep(225);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // b.start();

        // We can make use of annonymous inner class and lambda expressions
        Runnable a = () -> {
            for (int i = 1; i <= 100; i++)
                System.out.println("Hi");
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable b = () -> {
            for (int i = 1; i <= 100; i++)
                System.out.println("Hello");
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }

}
