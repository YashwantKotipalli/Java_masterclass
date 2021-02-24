public class ForLoop {

    public static void main(String[] args){


//        for(int i=2; i<9; i++){
//            //System.out.println("loop number : " + i + " hello " + i + "st User");
//            System.out.println(String.format("%.2f", calculateInterest(10000,i)));
//        }


//        for(int i=8; i>=2; i--){
//            System.out.println(String.format("%.2f", calculateInterest(10000,i)));
//        }

        int count =0;

        for(int i=1; i<101; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count==100){
                    break;
                }
            }
            else{
                continue;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for(int i=2; i <=n/2; i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }



}
