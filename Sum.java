/**
 * Created by Rukshar Alam on 11/13/2018.
 */
import java.io.File;
import java.util.Scanner;
public class Sum {
    static int sumTxt() throws  Exception{
        // pass the path to the file as a parameter
        File file =
                new File("C:\\Users\\Rukshar Alam\\Documents\\Codeforces\\src\\sum.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;

        while (sc.hasNextLine())
            sum += Integer.parseInt(sc.nextLine());

        return sum;
    }

    public static void main(String[] args) throws Exception {
        int n = sumTxt();
        System.out.println(n);
    }
}
