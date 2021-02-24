public class WhileDoWhile {


    public static void main(String[] args){

        int count =1;
        while(count !=6){
            System.out.println("While loop count is : " + count);
            count ++;
        }
        // for loop equivalent
        for(count =1; count!=6; count++){
            System.out.println("For Loop Count is: " + count);

        }

        // infinite while loop

        count = 1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("Count value is : " + count);
            count++;
        }

        // dowhile loop
        // do not forget to initialise before a while statement


        do{
            System.out.println("count value: " + count);
            count++;

            if(count>100){
                break;
            }
        } while(count !=6);

        count =0;
        int num = 2;
        int finishnum = 20;

        while(num<=finishnum){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }




            System.out.println("Even Number: " + num);

            count++;

            if(count ==5){
                System.out.println("count 5 reached");
                break;
            }
        }
        System.out.println(count);

    }

    // while loop challenge

    public static boolean isEvenNumber(int num){

        if(num%2==0){
            return true;
        }
        return false;
    }


}
