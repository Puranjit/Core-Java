public class ForLoop {

    public static void main(String args[]){

        // Creating a nested for loop for 5 days of the week and time from 9-5
        for (int i = 1; i <= 5; i++){
            System.out.println("Day " + i);

            for (int j = 9; j < 17; j++){
                    System.out.println("    Time " + j + " - " + (j + 1));
            }
        }
    }
    
}
