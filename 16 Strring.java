public class Strring{

    public static void main(String args[]){

        // Defining a value in string
        // String is a class and not a primitive datatype such as int, float, double, char. short etc.
        String s1 = "Puran";

        // Also we could play around with class: String
        // String s1 = new String("Puran"); // Throw an error -- Immutable property

        System.out.println(s1);

        String s3 = "Puran";
        System.out.println(s1 == s3); // true -- Address same

        // Method available for use in Class String
        System.out.println(s1.charAt(2));
        System.out.println(s1.hashCode());

        String s2 = "Jasreman";
        s2 = s2 + " Singh";
        System.out.println("Hello " + s2);
    }
}