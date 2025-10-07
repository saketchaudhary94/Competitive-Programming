package CP.codeforces;
import java.util.Scanner;

public class BMultiplyby2divideby6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            long n = sc.nextLong();
            long cnt2 = 0;
            long cnt3 = 0;

            while(n > 0 && n %3 == 0){
                cnt3++;
                n /= 3;
            }

            while(n > 0 && n%2 == 0){
                cnt2++;
                n /= 2;
            }

            if(n > 1 || cnt3 < cnt2){
                System.out.println(-1);
            }
            else{
                System.out.println(cnt3 + (cnt3 - cnt2));
            }
        }
    }
}
