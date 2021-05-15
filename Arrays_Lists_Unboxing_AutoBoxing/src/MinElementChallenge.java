import java.util.Scanner;
import java.util.Arrays;
public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);


    }

    public static int[] readIntegers(int count){

        System.out.println("Please enter the numbers: \r");
        int[] array = new int[count];

        for(int i=0; i<count; i++){

            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value<min){
                min = value;
            }
        }

        return min;

    }
}
