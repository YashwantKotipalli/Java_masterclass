public class Arrays {

    public static void main(String[] args){

//        int[] myIntArray = new int[10];

//        myIntArray[5] = 50;
//
//        int[] myIntArray  = {1,2,3,4,5,6,7,8};
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);

        int[] myIntArray = new int[10];

        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;

        }

        printArray(myIntArray);


//        double[] myDoubleArray = new double[5];
//        System.out.println(myIntArray[5]);


    }

    public static void printArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
