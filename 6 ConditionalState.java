public class ConditionalState {
    public static void main(String args[]) {

        int x = 10;

        if (x > 4)
            System.out.println("Hello..");

        // if multiple statements in if, we need to insert statements in curly brackets
        if (x > 7 && x < 11) {
            System.out.println("Bye..");
            System.out.println("If running again...");
        }

        else
            System.out.println("Else running");

        int x1 = 13;
        int y1 = 31;

        if (x1 > y1)
            System.out.println(x1);

        else
            System.out.println(y1);

        // We could create a Ternary operator to run the if-else condition
        // How it runs is:
        // condition ? (if .....) : else (.....)
        boolean result = x1 > y1 ? true : false;

        System.out.println(result);

    }

}
