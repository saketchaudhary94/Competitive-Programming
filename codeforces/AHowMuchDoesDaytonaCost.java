package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AHowMuchDoesDaytonaCost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            boolean k_is_present = false;
            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                if(k == Integer.parseInt(st.nextToken())) k_is_present = true;
            }

            if(k_is_present) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
