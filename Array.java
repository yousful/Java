import java.util.Arrays;
public class Array {

    //we declare an array of vowel letters by index
   public static void main(String args[]) {
       char consonants[] = new char[10];
    
       consonants[0] = 'b';
       consonants[1] = 'c';
       consonants[2] = 'd';
       consonants[3] = 'f';
       consonants[4] = 'g';
       consonants[5] = 'h';
       consonants[6] = 'i';
       consonants[7] = 'j';
       consonants[8] = 'k';
       consonants[9] = 'l';
   
       //we print out the array in string. if you don't import Array method as seen at the top it won't print out string
       System.out.println(Arrays.toString(consonants));

       //we declare an array of vowel letter using string
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};

    //replacing the letters in the array using index method.
    vowels[3] = 'b';
    vowels[4] = 'g';
    vowels[2] = 't';

    System.out.println(Arrays.toString(vowels));

    //fetching the lenght of the array
    System.out.println(vowels.length);

    //trying to sort an unsorted array
    char letters[] = {'v', 'z', 'x', 'y', 'w'};

    //sorting from index 1 to 3
    int startingIndex = 1;
    int endingIndex = 4;

    Arrays.sort(letters, startingIndex, endingIndex);
    System.out.println(Arrays.toString(letters));
    Arrays.fill(letters, startingIndex, endingIndex, 'x');

        //searching for item 'x in the array'
    char key = 'x';

    int foundItemIndex = Arrays.binarySearch(letters, key);

    //printing the search item
    System.out.println(foundItemIndex);
    
   }


}
