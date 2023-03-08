public class While {

    // Example code for nested while loop
    public static void main(String args[]){

        int i = 1;

        while (i<=4){
            int j = 0;
            System.out.println("Hi " + i);
            while (j < 3){
                System.out.println("Nested while loop " + j);
                j++;
            }
            i++;
        }
        System.out.println("Outside while loop " + i);
    
        int k = 5;
        do{
            System.out.println("Running for the 1st time");
            k++;
        }
        while(k < 4); 
    
        System.out.println("The value of k is: " + k); // 6 - incremented in do condition
    }
    
}
