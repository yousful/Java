import java.util.Scanner;

public class Grade {
    public static void main(String args[]) {
        Scanner score = new Scanner(System.in);
        //we take score input from the user
        System.out.println("Enter your score!");

        //we store the input the the variable testScore
        int testScore = score.nextInt();

        //we check the range of the user's testScore and print out the grade category it belong
        //for testScore from 75 to 100, the grade is A
        if(testScore >= 75 && testScore <= 100) {
            System.out.printf(" %d is in A category", testScore);

        } //for testCsore from 70 t0 74, the grade is AB
        else if(testScore >= 70 && testScore <= 74) {
            System.out.printf("%d is in AB category", testScore);
        } 
        
        //for testScore from 65 to 69, the grade is B
        else if(testScore >= 65 && testScore <= 69) {
            System.out.printf("%d is in B category", testScore);
        } 
        
        //for testScore from 60 to 64, the grade is BC 
        else if(testScore >= 60 && testScore <= 64) {
            System.out.printf("%d is in BC category", testScore);
        } 
        
        // for testScore from 55 to 59, the grade is C
        else if(testScore >= 55 && testScore <= 59) {
            System.out.printf("%d is in C category", testScore);
        } 
        
        // for testCsore from 50 to 54, the grade is D
        else if(testScore >= 50 && testScore <= 54) {
            System.out.printf("%d is in D category", testScore);
        } 
        
        // for testScore from 40 to 49, the grade is E
        else if(testScore >= 40 && testScore <= 49) {
            System.out.printf("%d is in E category", testScore);
        } 
        
        // for testScore from 0 to 39, the grade is F
        else (testScore >= 0 && testScore <= 39) {
            System.out.printf("%d is in F category", testScore);
        }

        score.close();
    }
    
}
