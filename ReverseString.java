import java.util.Scanner;

public class ReverseString
{
    static  String reverse_string(String input_string){
        String reverse = "";
        int sizeOfString  = input_string.length();

        for(int i = sizeOfString - 1; i >= 0; i--)
        {
            reverse = reverse + input_string.charAt(i);
        }

        return reverse;

    }
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = reverse_string(str);




        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}