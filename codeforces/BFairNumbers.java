package CP.codeforces;
import java.util.Scanner;

public class BFairNumbers {

    public static boolean isFair(long n){
        long num = n;
        while(n > 0){
            long lastDigit = n % 10;
            if(lastDigit != 0 && num % lastDigit != 0) return false;
            n = n / 10;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            
            while(!isFair(n)){
                n++;
            }

            System.out.println(n);
        }
        sc.close();
    }
}
