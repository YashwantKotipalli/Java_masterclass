

public class SwitchCase {

    public static void main (String[] args){

        int value = 3;

        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3,4 or a 5");
                System.out.println("actually it was " + value);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        // challenge
        char character = 'a';

        switch(character){

            case 'A':
                System.out.println("its an A!");
                break;
            case 'B':
                System.out.println("Its a B");
                break;

            case 'C':
                System.out.println("its a C");
                break;

            case 'D':
                System.out.println("its a D");
                break;

            case 'E':
                System.out.println("Its an E");
                break;

            default:
                System.out.println("Neither A,B,C,D,E");
        }

        String month = "january";
        switch(month.toUpperCase()){

            case "JANUARY":
                System.out.println("Jan");
                break;

            case "FEBRUARY":
                System.out.println("Feb");
                break;

            case "march":
                System.out.println("mar");
                break;

            default:
                System.out.println("Neither Jan, Feb or Mar");

        }

        }

    }





