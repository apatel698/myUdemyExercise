public class PrimitiveTypes {
    public static void PrimChallenge(){
        byte myByte = 17;
        short myShort = 1;
        int myInt = 0;
        long myLong = (50000L + 10L*(myByte + myShort + myInt));
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt)); //casting required for short
    }
}
