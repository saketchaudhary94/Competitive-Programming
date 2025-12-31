package CP.codeforces;
import java.util.Scanner;

public class CMoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int operation = 0;
            int currCnt = 0;
            for(int i =0;i < n;i++){
                if(s.charAt(i) == ')') currCnt--;
                else currCnt++;
                if(currCnt < 0){
                    operation++;
                    currCnt = 0;
                }
            }
            System.out.println(operation);
        }
        sc.close();
    }
}
