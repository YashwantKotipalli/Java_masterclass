public class Strings {

    public static void main(String[] args){

        /*
        *  Primitive DataTypes in Java:
        *
        * Boolean
        * Char - 16 Bits
        * Byte - 8 Bits
        * Short - 16 Bits
        * Int - 32 Bits
        * Long - 64 Bits
        * Float - 32 Bits
        * Double - 64 Bits
        *
        * */

        // String is not a datatype in Java, it is a class


        String myString = "This is a string";
        System.out.println("MyString is equal to: " + myString);
        myString += ", and I am it's creator";

        System.out.println(myString);

        myString += " and My name is Yashwant";
        System.out.println(myString);

        myString += "\u00A9 2021";
        System.out.println(myString);

        String numString1 = "35.08";
        String numString2 = "40.09";
        String totalnum = numString1 + numString2;
        System.out.println(totalnum);

        int lastInt = 10;
        String lastString = "20";
        System.out.println(lastString + lastInt);





    }
}
