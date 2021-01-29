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

        short bitlongliteralvalue = 3267;


        // casting in java

        int mytotal = (myMinIntValue/2);
        byte mynewbytevalue = (byte)(MyMinByteValue/2); // typecasting int to byte

        short myNewShortValue = (short)(MyMinShortValue/2);
        long mynewlongvalue = (myminlongvalue/2);



        // primitive Data types challenge

        byte bytevalue = 125;
        short shortvalue = 32500;
        int intvalue = 2147483630;
        long longvalue = (50000L + 10L*(bytevalue + shortvalue + intvalue));
        System.out.println(longvalue);

    }

}
