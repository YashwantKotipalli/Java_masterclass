public class primitivedatatypes {

    public static void main(String[] args){

        int myValue = 10000;
        int myMinIntValue = Integer.MAX_VALUE;
        int myMaxIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum value: " + myMinIntValue);
        System.out.println("Integer Maximum value: " + myMaxIntValue);

        //Busted Max Value


        // overflow
        System.out.println("Busted Max value: "+ myMaxIntValue+1);
        // undeflow
        System.out.println("Busted Min Value: "+ (myMinIntValue-1));


        // Byte primitive datatype

        byte MyMaxByteValue = Byte.MAX_VALUE;
        byte MyMinByteValue = Byte.MIN_VALUE;

        System.out.println("Minimum Byte value: " + MyMinByteValue);
        System.out.println("Maximum Byte Value: " + MyMaxByteValue);


        // Short Primitive datatype

        short MyMaxShortValue = Short.MAX_VALUE;
        short MyMinShortValue = Short.MIN_VALUE;

        System.out.println("Short Max Value "+ MyMaxShortValue);
        System.out.println("Short Min Value " + MyMinShortValue);



        //Long Primitive datatype


        // without L it will treat the number as an integer
        long mylongvalue = 100L;
        long mymaxlongvalue = Long.MAX_VALUE;
        long myminlongvalue = Long.MIN_VALUE;

        System.out.println("Long Max Value: " + mymaxlongvalue);
        System.out.println("Long min value: " + myminlongvalue);

        long bitlongliteralvalue = 2_147_483_647_234L;


    }

}
