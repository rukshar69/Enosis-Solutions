import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/4/2018.
 */
public class ReverseSentence {

    static  String reverse_sentence(String input_string){
        String reverse = "";
        String[] tempArray;

        /* delimiter */
        String delimiter = " ";

        /* given string will be split by the argument delimiter provided. */
        tempArray = input_string.split(delimiter);
        int array_size = tempArray.length;

        for(int i = array_size - 1; i >= 0; i--)
        {
            reverse = reverse + tempArray[i] + " ";
        }

        return reverse;

    }

    public static void main(String[] args) {
        System.out.println("Enter sentence to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = reverse_sentence(str);




        System.out.println("Reversed sentence is:");
        System.out.println(reverse);
    }
}
