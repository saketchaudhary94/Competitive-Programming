package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DBlackandWhiteStripe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();
            int prefix[] = new int[n];
            prefix[0] = s.charAt(0) == 'W' ? 1 : 0;

            for(int i =1;i < n;i++){
                if(s.charAt(i) == 'W'){
                    prefix[i] = prefix[i-1] + 1;
                }
                else{
                    prefix[i] = prefix[i-1];
                }
            }

            int minWhite = Integer.MAX_VALUE;
            for(int i = k - 1;i < n;i++){
                int val = prefix[i] - (i - k >= 0 ? prefix[i - k] : 0);
                if(val < minWhite){
                    minWhite = val;
                }
            }

            System.out.println(minWhite);
        }
    }
}
