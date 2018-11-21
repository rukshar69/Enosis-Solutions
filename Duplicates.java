import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rukshar Alam on 11/13/2018.
 */
public class Duplicates {
    static void duplicates(int[] a){
        int n = a.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Element : " + a[j]);
                }
            }
        }


    }
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
        duplicates(a);
    }
}
