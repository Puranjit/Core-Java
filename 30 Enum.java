// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

enum Status {
    Running, Pending, Error, Failed;
}

public class EnumA {
    public static void main(String[] args) {

        Status s = Status.Running;

        System.out.println(s);

        Status[] ss = Status.values(); // Storing all the enum values in an array
        System.out.println(ss); // Address in heap memory

        for (Status i : ss) {
            System.out.println(i + " at " + i.ordinal()); // Displays names of all the values defined in enum and their
                                                          // index values
        }

        // if-else conditions to execute enum
        Status k = Status.Running;

        if (k == Status.Running)
            System.out.println("The program is running...");
        else if (k == Status.Pending)
            System.out.println("The program is still pending...");
        else if (k == Status.Error)
            System.out.println("The program has an error...");
        else
            System.out.println("The program failed...");

        // Runnnign enum using switch
        Status k1 = Status.Failed;

        switch (k1) {
            case Running:
                System.out.println("The program is running...");
                break;
            case Pending:
                System.out.println("The program is still pending...");
                break;
            case Error:
                System.out.println("The program has an error...");
                break;
            default:
                System.out.println("The program failed...");
                break;
        }

    }
}
