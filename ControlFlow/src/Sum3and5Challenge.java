public class Sum3and5Challenge {


    public static void main(String[] args){

        int sum =0;
        int count =0;
        for(int i=1;i>=1 && i<=1000;i++){

            if(i%3==0 && i%5==0){

                System.out.println("number: " + i);
                sum +=i;
                count+=1;
            }

            if(count==5){
                break;
            }


        }
        System.out.println("Sum of all the numbers: " + sum);

    }


}
