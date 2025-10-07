package CP.codeforces;
import java.util.Scanner;

public class B01Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int cntZero = 0;
            int cntOne = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0') cntZero++;
                else cntOne++;
            }

            int mini = Math.min(cntOne , cntZero);
            if(mini %2 == 0){
                System.out.println("NET");
            }
            else{
                System.out.println("DA");
            }
        }
    }
}
