import java.util.ArrayList;

public class ChangingArray {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("before: " + numbers);
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println("after: " + numbers);
    }
    
}
