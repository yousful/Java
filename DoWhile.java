public class DoWhile {

    public static void main(String args[]) {

        int number = 5;
        int multiplier = 1;
    
        do {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            multiplier++;
        }
        while (multiplier <=10);

    }

}
