class TypeConversion{

    public static void main(String args[]){

        // byte to int --  Conversion
        byte b = 88;
        int i = b;
        
        System.out.println(i);

        // int to byte -- casting
        int i1 = 12;
        byte b11 = (byte) i1;

        System.out.println(b11);

        int i2 = 257;
        byte b12 = (byte) i2; // i2 % 256 (total no. of values in byte datatype)

        System.out.println(b12);

        // float to int
        float f = 5.6f;
        int i3 = (int) f; // only the int value - decimal value compromised

        System.out.println(i3);

        // Type promotion
        byte b1 = 90;
        byte b2 = 39;
        int result = b1+b2; // automatic type promotion

        System.out.println(result);

        int a = 3;
        a++;
        System.out.println(a);

        System.out.println(5/3);
    }

}