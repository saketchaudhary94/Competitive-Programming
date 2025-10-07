package CP.codeforces;
import java.util.Scanner;

public class AOddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            if(n%2 != 0){
                System.out.println("yes");
                continue;
            }
            else{
                if((n & (n-1)) == 0){
                    System.out.println("no");
                }
                else{
                    System.out.println("yes");
                }
            }
        }
        sc.close();
    }
}
