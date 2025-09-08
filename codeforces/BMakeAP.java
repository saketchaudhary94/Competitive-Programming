package CP.codeforces;
import java.util.Scanner;

public class BMakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean ans = false;

            int newA = 2*b - c;
            if(newA /a > 0 && newA %a == 0){
                ans = true;
            }

            int newB = (a + c)/2;
            if(newB / b >0 && newB %b == 0 && (c-a)%2 == 0){
                ans = true;
            }

            int newC = 2*b - a;
            if(newC / c > 0 && newC %c == 0){
                ans = true;
            }

            if(ans) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
