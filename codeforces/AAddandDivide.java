package CP.codeforces;
import java.util.Scanner;

public class AAddandDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ans = Integer.MAX_VALUE;

            for(int add = 0;add < 32;add++){
                int op = add;
                long new_b = b + add;
                long new_a = a;
                if(new_b == 1) continue;
                while(new_a > 0){
                    new_a /= new_b;
                    op++;
                }
                ans = Math.min(ans , op);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
