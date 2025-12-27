package CP.codeforces;
import java.util.Scanner;

public class BDifferentDivisors {

    public static int nextPrime(int n){
        for(int i = n;;i++){
            boolean isPrime = true;
            for(int j = 2;j*j <= i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                return i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int d = sc.nextInt();

            int p = nextPrime(d+1);
            int q = nextPrime(d + p);

            long ans = Math.min(1L*p*p*p , 1L*p*q);
            System.out.println(ans);
        }
        sc.close();
    }
}
