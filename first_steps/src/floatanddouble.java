public class floatanddouble {

    public static void main(String[] args){

        // float primitive datatype

        float myminfloatvalue  = Float.MIN_VALUE;
        float mymaxfloatvalue = Float.MAX_VALUE;

        System.out.println("Minimum Float value: "+myminfloatvalue);
        System.out.println("Minimum Float value: "+ mymaxfloatvalue);


        //double primitive datatype

        double mymindoublevalue = Double.MIN_VALUE;
        double mymaxdoublevalue = Double.MAX_VALUE;

        System.out.println("Minimum Double value: "+mymindoublevalue);
        System.out.println("Minimum Double value: "+ mymaxdoublevalue);


        float myfloatvalue = 5f/2f;
        double mydoublevalue= 5d/2d;

        System.out.println("float value: " + myfloatvalue);
        System.out.println("double value: " + mydoublevalue);


        // float and double challenge

        double pounds = 10d;
        double kilos = (pounds * 0.45359237d);
        System.out.println("Number of Kilos = " + kilos);

        // for precision calculations we DO NOT USE FLOAT OR DOUBLE
        // use BIGDECIMAL instead

    }
}
