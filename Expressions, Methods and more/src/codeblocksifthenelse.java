public class codeblocksifthenelse {

    public static void main(String[] args){

        // challenge is included in the code
        boolean gameOver = true;
        int secondscore = 10000;
        int secondlevelcompleted =8 ;
        int secondbonus = 200;
        int gamescore = 100;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        if(gameOver == true){

            // this is the fastest and the most memory efficient way of doing the problem
            // this creates new local variables having a local scope
            int finalscore = score +(levelcompleted*score);
            int secondfinalscore = secondscore + (secondlevelcompleted*secondbonus);
            System.out.println("The final score is: " + finalscore);
            finalscore +=1000;
            System.out.println("The second final score is: " + secondfinalscore);
        }



        // there are many other ways of doing the problem but they involve overriding the existing variables
        //eg:

        score = 800;
        secondlevelcompleted = 8;
        secondbonus = 200;

        int secondfinalscore = secondscore + (secondlevelcompleted*secondbonus);
        System.out.println("The final score is: " + secondfinalscore);



        // final score cannot be accessed outside the statement
        // variables created inside the if then else statement cannot be accessed outside
        // scope of the finalscore variable is local scope since, it is created inside the if then else code block and cannot be accessed by code outside the block
        //int finalscore = finalscore;




    }
}
