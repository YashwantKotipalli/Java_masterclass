public class Expressions {

    public static void main(String[] args){

        int result = 1+2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousresult=  "+ previousResult);
        result -= 1;
        System.out.println(result);
        System.out.println("previousresult=  "+ previousResult);

        result *=10;
        System.out.println(result);

        result /=5;
        System.out.println(result); // / gives the quotient of the division

        result %=3;
        System.out.println(result); // % gives the remainder of the division


        // abbreviating operators

        // result = result + 1
        result ++;
        System.out.println(result);

        result --; // result = result -1
        System.out.println(result);

        result +=2; // result = result +2
        System.out.println(result);

        result *=10; // result = result *10
        System.out.println(result);

        result/=3; // result = result / 3
        System.out.println(result);

        result -=2; // result = result -2
        System.out.println(result);




    }
}
