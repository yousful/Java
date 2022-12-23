import java.util.Arrays;

public class CopyArray {
    public static void main(String args[]) {

        //working with copy of array
        int numbers[] = {2, 4, 6, 8, 10};

        Arrays.fill(numbers, 5);
        int CopyOfNumbers[] = numbers;

        //this print out the same arrays
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(CopyOfNumbers));


        //working with copyOf() method
        int figure[] = {1, 2, 3, 4, 5};

        int CopyOfFigure[] = Arrays.copyOf(figure, figure.length);

        Arrays.fill(figure, 8);

        // this print out two different entire arrays
        System.out.println(Arrays.toString(figure));
        System.out.println(Arrays.toString(CopyOfFigure));

        //working with copyOfRange() method
        int range[] = {9, 8, 7, 6, 5};

        int startingIndex = 1;
        int endingIndex = 4;

        int CopyOfRange[] = Arrays.copyOfRange(range, startingIndex, endingIndex);

        //this print out the range of the array index selected
        System.out.println(Arrays.toString(range));
        System.out.println(Arrays.toString(CopyOfRange));




    }
    
}
