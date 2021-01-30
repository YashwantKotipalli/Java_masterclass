public class ifthen {

    public static void main(String[] args){

        boolean isAlien = false;
        if(isAlien ==  false) {
            System.out.println("It is an Alien !!!");
        }

        int topscore = 100;
        int secondtopscore = 8120;
        if(topscore ==50){
            System.out.println("Congrats, you passed the subject !!");
        }
        else if(topscore == 100){
            System.out.println("Congrats you got the high score !!");
        }
        // and operator

        if(topscore > secondtopscore && topscore <=100){
            System.out.println("Greater than secondtopscore and less than or equal to 100");
        }

        // OR operator

        if(topscore > 60 || secondtopscore >60){
            System.out.println("Both the scores are greater than 60");
        }

        // checking condition for boolean data types

        boolean isCar = true;
        if(isCar){
            System.out.println("It is a Car !!");
        }
        else if(!isCar){
            System.out.println("This is not a Car");
        }


        //ternary operator

       boolean wasCar = isCar ? true : false;

        if(wasCar){
            System.out.println("it was a car");
        }

        boolean ageofclientover20 =true;
        boolean isageofclientover18 = ageofclientover20 ? true : false;
        System.out.println(isageofclientover18);


        // operators final challenge

        double dbl = 20.00d;
        double dbl2 = 80.00d;
        double dblsum = (dbl+dbl2)*100.00d;
        double dblremainder = ((dblsum)% 40.00d);
        boolean isremainder = (dblremainder ==0) ? true: false;

        if(!isremainder){
            System.out.println("Got some remainder");
        }




    }
}
