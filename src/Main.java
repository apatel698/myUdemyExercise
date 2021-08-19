public class Main {
    public static void main(String[] args) {

        PrimitiveTypes.PrimChallenge(0);
        FloatAndDouble.Fd();
        SwitchStatement.Switch();
        Operator.NewChal();
        GameOver.GameScore();
        GameOver.calculateScore(true, 100,1,2000);
        int highScorePosition = GameOver.calculateHighScorePosition(600);
            GameOver.displayHighScorePosition("Jay",highScorePosition);


        SpeedConverter.printConversion(1.5); // should return value 1
        SpeedConverter.printConversion(10.25); // should return value 6
        SpeedConverter.printConversion(-5.6); // should return value -1
        SpeedConverter.printConversion(25.42); // should return value 16
        SpeedConverter.printConversion(75.114); // should return value 47
        MegaBytes.printMegaBytesAndKiloBytes(1024);
        System.out.println(BarkingDog.shouldWakeUp(true,15));
        System.out.println(BarkingDog.shouldWakeUp (true, 1));
        System.out.println(BarkingDog.shouldWakeUp (false, 2));
        System.out.println(BarkingDog.shouldWakeUp (true, 8));
        System.out.println(BarkingDog.shouldWakeUp (true, -1));
    }//main


}//class


