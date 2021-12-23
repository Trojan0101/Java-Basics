public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + finalScore);

        finalScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Your final score was " + finalScore);

        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Trojan", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Crusher", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Builder", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(90);
        displayHighScorePosition("Crusher", HighScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName + " managed to get into position " + playerPosition);

    }

    public static int calculateHighScorePosition(int playerScore){

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4; // Assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }

}
