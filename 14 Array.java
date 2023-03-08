public class Array{

    public static void main(String args[]){

        // Defining an array
        int nums[] = {1,2,3,4,5};
        

        // Pinting the value at index 1 in array nums
        System.out.println(nums[1]); //Output: 2

        // Printing the length of Array
        System.out.println("Length of array is: " + nums.length);

        // Updating value in the array
        nums[1] = 6;
        // System.out.println(nums[1]); //Output: 6

        // Dynamically defining an array
        int arr[] = new int[4];

        arr[0] = 2;

        // Assigining values in the array (Update arr[i] = arr[i-1] * 2)
        for (int i = 0; i < 4; i++){
            if (i>0)
                arr[i] = arr[i-1] * 2;
        }

        // Running while loop to print values in the array
        System.out.println("Printing values generating in the 1d array");

        int m = 0;
        while(m < 4){
            System.out.print(arr[m] + " ");
            m++;
        }

        System.out.println();

        // Defining a multi dimensional array
        int Arr[][] = new int[3][4];

        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                // updating all the values in the multi-dim array with random values
                Arr[i][j] = (int) (Math.random() * 10); // Casting float values to integers

            }
        }
        System.out.println("Printing values generating in the 2d array");        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged array

        int arr1[][] = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0; j<arr1[i].length;j++){
                arr1[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Printing values generating in the Jagged array");
        // Execution of enhanced for loop
        for (int p[]: arr1){
            for(int q:p){
                System.out.print(q + " ");
            }
            System.out.println();
        }

        // 3D array
        int ddd[][][] = new int[3][3][3];

        for (int i = 0; i < ddd.length; i++){
            for(int j = 0; j < ddd[i].length; j++){
                for(int k = 0; k < ddd[i][j].length; k++){
                    ddd[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        
        System.out.println("Printing values generating in the 3d array");

        // for (int i = 0; i < ddd.length; i++){
        //     for(int j = 0; j < ddd[i].length; j++){
        //         for(int k = 0; k < ddd[i][j].length; k++){
        //             System.out.print(ddd[i][j][k]);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }   

        // Using enhanced for loop

        for(int l[][]: ddd){
            for(int t[]: l){
                for(int n:t){
                    System.out.print(n);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    
}
