// This program explains the concept of constructors, getters, setters, and ENCAPSULATION

class Human {

    // Creating private instance variables
    // The private variables cannot be accessed outside the class where they are
    // defined directly, but we could use Constructors, getters, setters for same
    private int age;
    private String name;

    public Human() { // default constructor
        this.age = 12;
        this.name = "John";
    }

    public Human(int age, String name) { // prametrized constructor
        this.age = age;
        this.name = name;
    }

    public Human(String name) { // Custom constructor
        this.name = name;
    }

    // How to generate Getters and Setters automatically --
    // Right click > Source action > Generate Getters; Setters (Make sure to install
    // required libraries)
    // Defining getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Defining setters
    public void setAge(int age) { // age is a local variable
        // this is a keyword - which represents the current object that is calling this
        // method in the main class
        this.age = age;
    }

    public void setName(String name) {// name is a local variable
        this.name = name;
    }
}

public class Encapsulation {

    public static void main(final String args[]) {

        // Creating an instance
        Human ha = new Human();
        System.out.println(ha.getName() + " : " + ha.getAge()); // return values defined in default constructor

        Human ha1 = new Human(18, "Jogi");
        System.out.println(ha1.getName() + " : " + ha1.getAge()); // return values defined in paramterized constructor

        Human ha2 = new Human("Jogi");
        System.out.println(ha2.getName() + " : " + ha2.getAge()); // return values defined in paramterized constructor

        // We cannot access the values of name and age from the Class Human as they are
        // defined as private variables
        // ha.age = 24;
        // ha.name = "Puran";

        // System.out.println(ha.name);

        ha.setAge(25);
        ha.setName("Puranjit");

        System.out.println(ha.getName() + " : " + ha.getAge());
    }
}