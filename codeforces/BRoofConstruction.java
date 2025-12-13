package CP.codeforces;
import java.util.Scanner;

public class BRoofConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            n--;
            int num = Integer.highestOneBit(n) -1;

            StringBuilder sb = new StringBuilder();
            while(num >=0){
                sb.append(num).append(" ");
                num--;
            }

            num = Integer.highestOneBit(n);
            while(num <= n){
                sb.append(num).append(" ");
                num++;
            }

            System.out.println(sb);
        }
        sc.close();
    }
}
