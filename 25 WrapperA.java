// Some of the wrapper classes in Java are

// All the primitive datatypes

// int -> Integer
// char -> Character
// double -> Double
// byte -> Byte .... 

public class WrapperA {

    public static void main(String[] args) {

        int i = 13;
        System.out.println(i);

        Integer num1 = new Integer(i); // Warning
        Integer num2 = i; // no-warning

        System.out.println(num1);
        System.out.println(num2);

        // How to use wrapper classes - there are tons of methods that are already
        // defined in these wrapper classes which could be used

        String str = "12";
        // System.out.println(str * 2); // Error because str is a string

        Integer s = Integer.parseInt(str);

        System.out.println(s);

        System.out.println(s * 2);

        System.out.println(Math.pow(s, 2));
    }

}