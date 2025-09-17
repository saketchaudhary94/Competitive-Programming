package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BLuntikandSubsequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cntZero = 0;
            int cntOne = 0;
            for(int el : arr){
                if(el == 0) cntZero++;
                else if(el == 1) cntOne++;
            }

            long ways = cntOne * (long)Math.pow(2 , cntZero);
            System.out.println(ways);
        }
    }
}
