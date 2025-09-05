package CP.codeforces;
import java.util.Scanner;

public class AAvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(n %2 == 1 || n < 4){
                System.out.println(-1);
            }
            else{
                long mini = (n+5)/6;
                long maxi = n / 4;
                System.out.println(mini+" "+maxi);
            }
        }
    }
}
