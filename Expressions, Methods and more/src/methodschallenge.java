public class methodschallenge {

    public static void main(String[] args) {

        int highscoreposition=  calculateHighScorePosition(1500);
        displayHighScorePosition("yashwant", highscoreposition);

        highscoreposition = calculateHighScorePosition(900);
        displayHighScorePosition("Bruno",highscoreposition);

        highscoreposition = calculateHighScorePosition(400);
        displayHighScorePosition("Pooji",highscoreposition);

        highscoreposition = calculateHighScorePosition(50);
        displayHighScorePosition("Deepa",highscoreposition);

    }

    public static void displayHighScorePosition(String name , int position) {

        System.out.println("Player " + name + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerscore){

//        if(playerscore >=1000){
//            return 1;
//
//        }
//        else if(playerscore>=500){
//            return 2;
//
//        }
//        else if(playerscore>=100){
//            return 3;
//        }
//        return 4;

        //reducing the number of return statements in the code

        int position =4; // assuming position4 will be returned

        if(playerscore >= 1000){
            position =1;
        } else if(playerscore>=500){
            position =2;
        }else if(position>=100){
            position=3;
        }
        position = 4;
        return position;
    }
}
