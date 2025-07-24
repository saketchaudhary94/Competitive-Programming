package CP.codeforces;
import java.util.Scanner;

public class AAmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for(int i =0;i < n;i++){
            int el = sc.nextInt();
            if(el == 0){
                System.out.println(0);
                return;
            }
            min = Math.min(min , Math.abs(el));

        }
        System.out.println(min);
        sc.close();
    }
}
