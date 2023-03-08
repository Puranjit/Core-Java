// In this program we will create another class and call it from main function

// Defining a class
class Calci{

    int a = 1;
    
    // Defining a method in the class which could be accessed 
    // from main class which takes in two values defined in main function
    public int add(int n1, int n2){

        int r = n1 + n2;
        System.out.println("Running method inside the Calci class");
        return r;
    }

}

public class OopsIntro{

    public static void main(String args[]){

        // Defining the values to be added
        int x = 3;
        int y = 5;

        // int result = x + y;

        // Defining an object reference to call the method in the class
        Calci cal = new Calci();

        // We are storing the value returned by a method that is create in other class
        int result = cal.add(x, y);

        // Printing the result
        System.out.println(result);
    }
    
}
