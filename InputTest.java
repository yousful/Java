import java.util.Scanner;

public class InputTest {
    public static void main(String args[]) {

        //working with scanner to take input from the user
        //we declare Scanner and give it any name but i chose scanner for easy and simple name
        //new Scanner method means we are taking an input data to be stored inside scanner
      Scanner scanner = new Scanner(System.in);

      //we are printing an instruction to the user on the sonsole
      System.out.println("Please enter your name!");
        
      //we declare a variable 'name' to store the user response in the next line
      String name = scanner.nextLine();

      //we print saltutation to the console with the user name passed in it
      System.out.printf("Hello %s ", name);

      //we then print another question to the reader on the console
      System.out.println("How old are you?");

      //decalsre a variable name 'age' to receive an integer response
      int age = scanner.nextInt();

      //this line is to clear up the input buffer after the user enters integer response
      //because for nextInt or nextBoolean etc except nextLine method, the input buffer will remain untill scanner.nextLine() is declared again
      scanner.nextLine();
        //we confirmed the age and ask another question
      System.out.printf("%d is quite an excellent age to learn Programming. What language do you prefer to learn?", age);

      //the user enters answer
      String language = scanner.nextLine();

        //we then confirmed the answer
      System.out.printf("%s is a popular programming language", language);

      //we then ask another question
      System.out.println(" How many hours can you put in per day to learn java?");

      //this is another way to take interger input in string format and convert it to interger without having to worry about input buffer 
      int hours = Integer.parseInt(scanner.nextLine());

      System.out.printf("%d hours is a good learning duration provided you are consistent", hours);

      //the scanner must be closed before the program can run and Scanner method must be imported above the class name
      scanner.close();
    }
    
}
