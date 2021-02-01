public class methods {


    public static void main(String[] args){
//        boolean gameOver = true;
//        int score = 500;
//        int levelCompleted = 2;
//        int bonus = 200;

        int highscore = calculateScore(true, 500, 2, 200);
        System.out.println("Highscore = " + highscore);
        calculateScore(true, 800, 10, 100);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 200;
            System.out.println(finalScore);
            return finalScore;
        }
       return -1;




    }
}
