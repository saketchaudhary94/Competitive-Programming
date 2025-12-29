package CP.codeforces;
import java.util.Scanner;

public class ABuyingTorches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            long totalSticks = (long) y * k + (k - 1);
            long minTrades = (totalSticks + x-2) / (x-1);
            minTrades += k;

            System.out.println(minTrades);
            
        }
        sc.close();
    }
}
