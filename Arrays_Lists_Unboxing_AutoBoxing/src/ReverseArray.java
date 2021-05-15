
import java.util.Arrays;
public class ReverseArray {

   public static void main(String[] args){

       int[] array = {100,3993,993,10,223,39348,9034};

       System.out.println(Arrays.toString(array));

       reverse(array);

       System.out.println("reversed array" + Arrays.toString(array));


   }

   public static void reverse(int[] array){

       int maxIndex = array.length -1;
       int halfIndex = array.length /2;
       int temp;

       for(int i=0; i<array.length; i++){

           temp = array[i];
           array[i] = array[maxIndex-i];
           temp = array[maxIndex-i];
       }


   }
}
