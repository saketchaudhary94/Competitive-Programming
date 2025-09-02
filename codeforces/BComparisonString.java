package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BComparisonString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int curr = 1;
            int maxi = 1;

            for(int i =1;i < n;i++){
                if(s.charAt(i-1) == s.charAt(i)){
                    curr++;
                    maxi = Math.max(maxi , curr);
                }
                else{
                    curr = 1;
                }
            }
            System.out.println(maxi+1);
        }
    }
}
