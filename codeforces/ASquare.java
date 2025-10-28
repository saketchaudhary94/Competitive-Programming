package CP.codeforces;
import java.util.Scanner;

public class ASquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a == b && b==c && c==d && d==a){
                System.out.println("Yes");
            }
            else{


                System.out.println("No");
            }
        }
        sc.close();
    }
}
