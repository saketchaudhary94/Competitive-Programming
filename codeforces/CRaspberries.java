package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CRaspberries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int arr[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int ans = Integer.MAX_VALUE;
            int evenCount = 0;
            for(int i =0;i < n;i++){
                if(arr[i] % 2 == 0) evenCount++;
                if(arr[i] % k == 0) ans = 0;
                ans = Math.min(ans , k - arr[i] % k);
            }

            if(k == 4){
                if(evenCount >= 2){
                    ans = Math.min(ans , 0);
                }
                else if(evenCount == 1){
                    ans = Math.min(ans , 1);
                }
                else if(evenCount == 0){
                    ans = Math.min(ans , 2);
                }
            }

            System.out.println(ans);
        }
    }
}
