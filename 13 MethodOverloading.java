// This code explains the method overloading concept in Java
//  in which 3 method with same are created 

// They differ in the return datatype used to define function 
// and the no./datatypes of input used to define the method in the class

class OverLo{

    public int add(int n1, int n2, int n3){
        return (n1 + n2 + n3);
    }
        
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(int n1, double n2){
        return (n1 + n2);
    }
}

public class MethodOverloading {
    
    public static void main(String args[]){

        int n1 = 2;
        int n2 = 4;
        int n3 = 6;

        double d1 = 44.0;

        OverLo OLo = new OverLo();

        // Calling the 1st method in the child class
        // int re = OLo.add(n1, n2, n3);

        // Calling the 2nd method in the child class
        // int re = OLo.add(n1, n2);

        // Calling the 3rd method in the child class
        double re = OLo.add(n1, d1);

        System.out.println(re);

    }
    
}
