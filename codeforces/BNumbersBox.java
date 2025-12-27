package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BNumbersBox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int absSum = 0;
            int  minEl = 100;
            int negCnt = 0;

            for(int i =0;i < n;i++){
                st = new StringTokenizer(br.readLine());
                for(int j =0;j < m;j++){
                    int x = Integer.parseInt(st.nextToken());
                    absSum += Math.abs(x);
                    minEl = Math.min(minEl , Math.abs(x));
                    if(x < 0) negCnt++;
                }
            }

            if(negCnt %2 != 0){
                absSum -= 2 * minEl;
            }

            System.out.println(absSum);
        }
    }
}
