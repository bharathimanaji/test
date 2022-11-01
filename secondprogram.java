public class a1 {
    public static void main(String [] args)
    {
        //variable:Temporary place to store the value
        //Syntax pf declaring a variable : datatype variable name= value
        //Rules to be followed for maintaining a variable name.
        //1. Never start a variable name with a number or a special character
        //2. Never use any special characters between variable names apart from '_' symbol
        //3. Never ues java keywords as your variable name
        //4. Always the variable name should start with a small letter

        //Different types of Data Types in java:
        // 1. Primitive Data Type: int, chat, boolean, long, float,double, byte, short
        //2.  Non primitive data type: String, Arrays, Set, list etc..............
        int a=20; //Accept range value of -2^31 to 2^31-1
        boolean b=true; //Accepts only true or false value
        char c='d';// Accepts a single vharavter only (it can be a digit or a special character)
        double d=24.5514; // Accepts decimal values up to 16 significant digits
        float e=23.45f;  // Accepts decimal values up to 5 significant digits
        byte f=-128; //Accepts a range of values -128 to 127
        short g=-2532; // Accepts a range of values from -32768 to 32767
        long h=5625125; // Accepts a range values from -2^63 to 2^63-1
        System.out.println(a+e);
        System.out.println(c-g);
        System.out.println(e-g/h);
        System.out.println(e-(a+d*h));



    }
}
