package CP.codeforces;
import java.util.Scanner;

public class BMEXorMixup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = 0;

            if((a -1) %4 == 0){
                x = a-1;
            }
            else if((a -1) %4 == 1){
                x = 1;
            }
            else if((a -1) %4 == 2){
                x = a;
            }
            else{
                x = 0;
            }

            if(x == b){
                System.out.print(a);
            }
            else if(x != b && (x^b) != a){
                System.out.print(a + 1);
            }
            else{
                System.out.print(a + 2);
            }
            System.out.println();
        }
        sc.close();
    }
}
