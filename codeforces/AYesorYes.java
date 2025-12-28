package CP.codeforces;
import java.util.Scanner;

public class AYesorYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int cntY = 0;
            for(int i =0;i < s.length();i++){
                if(s.charAt(i) == 'Y') cntY++;
            }

            if(cntY >= 2) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
