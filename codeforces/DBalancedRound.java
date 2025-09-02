package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DBalancedRound {
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
            Arrays.sort(arr);
            int curr = 1;
            int maxi = 1;

            for(int i =1;i < n;i++){
                if(arr[i] - arr[i-1] <= k){
                    curr++;
                    maxi = Math.max(maxi , curr);
                }
                else{
                    curr = 1;
                }
            }

            System.out.println(n - maxi);
        }
    }
}
