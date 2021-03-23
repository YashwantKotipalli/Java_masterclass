public class forStatement {


    public static void main(String[] args){

        System.out.println("The amount of 40000 at 12% interest is: " + calculateInterest(40000, 12.00));
        System.out.println("The amount of 40000 at 8% interest is: " + calculateInterest(40000, 8.00));
        System.out.println("The amount of 40000 at 4% interest is: " + calculateInterest(40000, 4.00));
        System.out.println("The amount of 40000 at 2% interest is: " + calculateInterest(40000, 2.00));


        for(double i =8; i>1; i--){
            System.out.println(i + "% interest rate: " + String.format("%.2f", calculateInterest(40000, i)));
        }


        int count =0;
        for(int i =10; i<50 ; i++) {

            if(isPrime(i)){
                count ++;
                System.out.println("Exiting for loop");
                break;
            }


        }




    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2; i<=(long) Math.sqrt(n/2); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;

    }

    public static double calculateInterest(double amount, double interestRate){

            return (amount* (interestRate/100));

    }
}
