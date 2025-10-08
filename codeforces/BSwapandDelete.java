package CP.codeforces;
import java.util.Scanner;

public class BSwapandDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String s = sc.nextLine();
            int cnt0 = 0 , cnt1 = 0;
            
            for(char ch : s.toCharArray()){
                if(ch == '1') cnt1++;
                else cnt0++;
            }

            int ts = 0;
            for(int i =0;i < s.length();i++){
                if(s.charAt(i) == '1' && cnt0 > 0){
                    ts++;
                    cnt0--;
                }
                else if(s.charAt(i) == '0' && cnt1 > 0){
                    ts++;
                    cnt1--;
                }
                else{
                    break;
                }
            }
            System.out.println(s.length() - ts);
        }
        sc.close();
    }
}
