public class GreaterOfn {
    public static void main(String args[]){
        
        // Greater of 2 numbers
        int x = 13;
        int y = 31;

        if (x > y)
            System.out.println(x);
        
        else
            System.out.println(y);

        // Greater of 3 numbers
        int z = 47;
        if (x > y && x > z)
            System.out.println(x);
        
        else if (x < y && y > z)
            System.out.println(y);
        
        else
            System.out.println(z);

    }
}
