import java.util.Scanner;

public class ReadingUserInputChallenge {





    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        int count=0;
        int sum=0;

        while(count <10){

            int order = count+1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt =scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                count++;
                sum+=number;



            }else{
                System.out.println("Invalid Number");
            }

            scanner.nextLine();


        }

        System.out.println("SUM = " + sum + " AVG = " + sum/count);
        scanner.close();


    }
}
