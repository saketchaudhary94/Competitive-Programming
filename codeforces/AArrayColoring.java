package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AArrayColoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int oddCnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int el = Integer.parseInt(st.nextToken());
                if(el %2 != 0){
                    oddCnt += 1;
                }
            }

            if(oddCnt %2 == 0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
