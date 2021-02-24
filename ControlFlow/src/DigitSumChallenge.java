public class DigitSumChallenge {

    public static void main(String[] args){

        System.out.println(sumDigits(10101));

    }

    public static int sumDigits(int number){


        int sum=0;

        if(number<10 && number>=0){
            return number;
        }

        if(number<0){
            return -1;
        }

        while(number>=10){
            sum+=number%10;
            number /=10;
        }

        if((number<10)){
            sum+=number;
        }
        return sum;





    }

}
