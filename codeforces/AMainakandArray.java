package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AMainakandArray {
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

            int maxi = 0;
            // if the first value is stick 
            for(int i=1;i < n;i++){
                maxi = Math.max(arr[i] - arr[0],maxi);
            }
            
            // if the last value is stick 
            for(int i = 0;i < n-1;i++){
                maxi = Math.max(maxi ,arr[n-1] - arr[i]);
            }

            // if both of the values are not equal
            for(int i = n-1;i >0;i--){
                maxi = Math.max(maxi , arr[i-1] - arr[i]);
            }

            System.out.println(maxi);
        }
    }
}
