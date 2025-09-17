package CP.codeforces;

import java.util.Scanner;

public class BMakeitDivisibleby25 {

    public static int helper(String n , String ch){
        int idx = 1;
        int op = 0;

        for(int i = n.length()-1;i>=0;i--){
            if(n.charAt(i) == ch.charAt(idx)){
                idx--;
                if(idx < 0){
                    break;
                }
            }
            else{
                op++;
            }
        }

        if(idx >= 0){
            op = Integer.MAX_VALUE;
        }

        return op;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String n = sc.nextLine();
            String arr[] = {"00" , "25" , "50" , "75"};
            int ans = Integer.MAX_VALUE;
            for(String ch : arr){
                ans = Math.min(ans , helper(n , ch));
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
