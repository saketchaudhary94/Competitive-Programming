package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BCakeCollection {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int arr[] = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            long ans = 0;
            for(int i =n-1; i >= 0 && m >0;i--){
                ans += (long)arr[i] * m;
                m--;
            }

            System.out.println(ans);
        }
    }
}
