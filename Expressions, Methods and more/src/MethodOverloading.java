public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("yash", 20);
        System.out.println("New Score is: " + newScore);

        calculateScore(200);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*100;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score*10000;
    }

    public static int calculateScore(){
        return 0;
    }




}
