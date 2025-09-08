package CP.codeforces;
import java.util.Scanner;

public class AMapleandMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b){
                System.out.println(0);
                continue;
            }
            else if(a%b == 0 || b %a == 0){
                System.out.println(1);
                continue;
            }
            else{
                System.out.println(2);
                continue;
            }

        }        
    }
}
