package CP.codeforces;
import java.util.Scanner;

public class BBitwiseReversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int a = 0 , b = 0 , c = 0;
            for (int i = 0; i < 32; i++) {
                if ((x & (1 << i)) != 0) {
                    a |= (1 << i);
                    b |= (1 << i);
                }
                if ((y & (1 << i)) != 0) {
                    b |= (1 << i);
                    c |= (1 << i);
                }
                if ((z & (1 << i)) != 0) {
                    c |= (1 << i);
                    a |= (1 << i);
                }
            }
            

            if((a & b) == x && (b & c) == y && (c & a) == z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
