public class ForLoop {
    public static void main(String args[]) {

        //writing a for loop to create a multiolication table from 1 to 12
        for (int number = 1; number <= 12; number++){
            for (int multiplier = 1; multiplier <= 12; multiplier++) {
                System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
            }
        } 

        //writing a forloop to create list of odd number from 1 to 20
        for (int data = 1; data <= 20; data++) {
            if(data %2 == 1) {
                System.out.println(data);
            }

        //using for loop to calculate the sum of numbers in an array
    }
        int array[] = {2, 4, 6, 8, 10};

        int sum = 0; 

        for (int value : array){
            sum += value;
        }
        System.out.println(sum);
    }
}
