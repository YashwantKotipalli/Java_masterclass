public class TeenNumberChecker {

    public static void main(String[] args){

    }

    public static boolean hasTeen(int num1, int num2, int num3){

        if(((13<=num1)&&(num1<=19)) || ((13<=num2)&&(num2<=19)) || ((13<=num3)&&(num3<=19))){
            return true;
        }
        return false;

    }
    public static boolean isTeen(int num4){
        if(((13<=num4)&&(num4<=19))){
            return true;
        }
        return false;
    }
}
