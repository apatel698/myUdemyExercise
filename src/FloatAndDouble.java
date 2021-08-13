import java.sql.SQLOutput;

public class FloatAndDouble {
    public static void Fd(){
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("My Max Float: " + maxFloat);
        System.out.println("My Min Float: " + minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("My Max Double: " + maxDouble);
        System.out.println("My Min Double: " + minDouble);

        int myInt = 5;
        float myFloat = (float) 5.25; //could use f at the end of the number or can cast like done here by adding (float)
        double myDouble = 5.25d;

    }
}//class
