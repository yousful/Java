import java.util.Scanner;

public class SwitchCase {

    //working with switch case
    //using switch case to execute your logic is more faster than using if else statement.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the operation you want to perform");
        String operation = scanner.nextLine();

        switch(operation) {
            case "summation":
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
            break;
            //the break will help stop the operation from proceeding to the next case
            //if break is remove the the cases will print at once including the default.
            case "substraction":
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
            break;
            
            case "multiplication":
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
            break;

            case "division":
            if (number2 == 0) {
                System.out.println("cannot divide by zero");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
            break;
            //default is what will br printed out when the kind of operation entered by the user is not supported.
            default:
            System.out.printf("%s is not supported", operation);

        }
        scanner.close();
    }
    
}
