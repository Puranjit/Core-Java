
// Importing Buffer reader libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Inputz {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        // Buffer reader accepts the input as a String, we will need to convert that
        // string into an integer (if input is Integer)

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        // Good practise to terminate library usage after it is used
        // bf.close();

        // Also we could use Scanner class to read Input
        // System.in - defines we are taking input from user
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        System.out.println(res);

        // Good practise to terminate library usage after it is used
        sc.close();
    }
}
