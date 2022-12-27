import java.util.ArrayList;
import java.util.Comparator;

public class DynamicArray {
    public static void main(String args[]){

        //ArrayList is a dynamic array that doesn't have lenght limitation.
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);


        numbers.forEach(number -> {
            System.out.println(number * 2);
        });
        // numbers.remove(3);
        // numbers.remove(Integer.valueOf(4));
        // numbers.clear();
        // numbers.set(2, Integer.valueOf(10));
        // numbers.sort(Comparator.naturalOrder());
        // numbers.sort(Comparator.reverseOrder());

        // System.out.println(numbers.contains(Integer.valueOf(12)));
        // System.out.println(numbers.isEmpty());
        // System.out.println(numbers.size());
        System.out.println(numbers.toString());
        // System.out.println(numbers.get(3));
    }
    
}
