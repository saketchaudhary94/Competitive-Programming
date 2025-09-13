package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AABBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            int n = s.length();
            if(s.charAt(0) != s.charAt(n-1)){
                if(s.charAt(n-1) == 'a'){
                    sb.setCharAt(n-1, 'b');
                }
                else{
                    sb.setCharAt(n-1, 'a');
                }
            }
            System.out.println(sb);
        }
    }
}
