package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BArraymerging {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            int b[] = new int[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                b[i] = Integer.parseInt(st.nextToken());
            }

            int maxA[] = new int[2*n + 1];
            int maxB[] = new int[2*n + 1];
            int cnt = 1;

            for(int i =1;i < n;i++){
                if(a[i] == a[i-1]){
                    cnt++;
                }
                else{
                    maxA[a[i-1]] = Math.max(cnt , maxA[a[i-1]]);
                    cnt = 1;
                }
            }
            maxA[a[n-1]] = Math.max(cnt , maxA[a[n-1]]);

            cnt = 1;
            for(int i =1;i < n;i++){
                if(b[i] == b[i-1]){
                    cnt++;
                }
                else{
                    maxB[b[i-1]] = Math.max(cnt , maxB[b[i-1]]);
                    cnt = 1;
                }
            }
            maxB[b[n-1]] = Math.max(cnt , maxB[b[n-1]]);

            long maxFreq = -1;
            for(int i =0;i <= 2*n;i++){
                maxFreq = Math.max(maxFreq ,(long)maxA[i] + maxB[i]);
            }

            System.out.println(maxFreq);
        }
    }
}
