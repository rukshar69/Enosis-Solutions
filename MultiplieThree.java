/**
 * Created by Rukshar Alam on 11/4/2018.
 */
public class MultiplieThree {

    static void multiple(){

        for(int i= 200;i>=1;i--){
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        multiple();
    }
}
