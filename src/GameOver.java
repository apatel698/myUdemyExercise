public class GameOver {
    public static void GameScore() {

       } //GameScore method
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } return -1;
    }// calculateScore method


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "
                + position + " on the high score table.");

    }// displayHighScorePosition method

    public static int calculateHighScorePosition(int score) {
        int position; // this is needed to initiate int before assigning the value
        if (score > 1000) {
            position = 1; //return 1;
        } else if (score <= 1000) {
            position = 2; // return 2;
        } else if (score <= 500) {
            position = 3; //return 3
        } else {
            position = 4; //return 4
        } return position; // this return is necessary
    } // calculateHighScorePosition method
    }// class












        /* above code snippet is cleaner version of below: */
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//    }
//}