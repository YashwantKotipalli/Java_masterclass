import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter your Year Of Birth: ");



        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){

            int year = scanner.nextInt();

            System.out.println("Your year of Birth: " + year);
            scanner.nextLine();
            System.out.println("Enter your name: ");

            // reading the next line of input
            String name = scanner.nextLine();

            int age = 2021 - year;

            if(age>=0 && age<=100){
                System.out.println("Your name is: " + name + ", you're age is: " + age + " years old.");
            } else{
                System.out.println("Invalid year of birth.");
            }

        } else{
            System.out.println("Unable to parse year of Birth");
        }






        scanner.close();


    }
}
