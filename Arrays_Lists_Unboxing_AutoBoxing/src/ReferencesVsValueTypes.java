
import java.util.Arrays;
public class ReferencesVsValueTypes {


    public static void main(String[] args){


        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("Reference Types for the two variables where, anotherIntVariable is referencing myIntValue variable");
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println( "anotherIntValue: " + anotherIntValue);


        anotherIntValue++;

        System.out.println("Values after incrementing only the reference variable");
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;  //anotherArray is just a pointer to the myIntArray

        System.out.println("anotherArray is just a pointer to the myIntArray (references it)");
        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));


        System.out.println("This is de-referencing the variable to the old array and assigns the reference to the new array");
        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modification myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modification anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){

        array[0] = 2;
        array = new int[] {1,2,3,4,5};


    }
}
