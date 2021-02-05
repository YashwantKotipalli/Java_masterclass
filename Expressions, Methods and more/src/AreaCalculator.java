public class AreaCalculator {

    public static void main(String[] args) {

    }

    public static final double INVALID_MESSAGE_VALUE = -1.0;

    private static double area(double radius) {

        if(radius <0){
            return INVALID_MESSAGE_VALUE;
        }
          double area = Math.PI*(radius*radius);
          return area;
    }

    private static double area(double x, double y){

        if(x<0 || y<0){
            return INVALID_MESSAGE_VALUE;
        }
        double areaOfrectangle = x*y;
        return areaOfrectangle;
    }
}
