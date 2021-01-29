public class variables {
// variables class



    // main method
    public static void main(String[] args){

        int myfirstnumber= (10 + 5) + (2*10); // declaration statement
        System.out.println("variable myfirstnumber = " + myfirstnumber); // statement


        // expressions challenge

        int mysecondnumber = 12;
        int mythirdnumber = myfirstnumber*2;
        // int mythirdnumber = 6;
        int myTotalnumber = myfirstnumber + mysecondnumber + mythirdnumber;
        System.out.println(myfirstnumber+mysecondnumber+mythirdnumber);
        System.out.println(myTotalnumber);


        // final variables challenge

        int myLastOne = 1000 - myTotalnumber;
        System.out.println(myLastOne);
    }
}
