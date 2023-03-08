// Parent/super class
class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Child/ sub class
class advClass extends Calc {

    // Method over-riding: We define a method in child class, now this method would
    // always be called everytime an instance calls this method
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public double div(int n1, int n2) {
        return n1 / n2;
    }
}

// Multi level inheritance
class veryAdvClass extends advClass {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String args[]) {

        // To access nethod from all the classes we could create an instance for the
        // last child class possible and then call the methods from that instance
        veryAdvClass c1 = new veryAdvClass();

        int r1 = c1.add(6, 7);
        int r2 = c1.sub(9, 3);

        int r3 = c1.multi(5, 7);
        double r4 = c1.div(19, 8);

        double r5 = c1.power(5, 5);

        // Displaying results
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
