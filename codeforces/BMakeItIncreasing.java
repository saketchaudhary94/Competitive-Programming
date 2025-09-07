package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BMakeItIncreasing {
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

            int ans = 0;
            for(int i = n-2;i>=0;i--){
                while(arr[i] >= arr[i+1]){
                    ans++;
                    arr[i] /= 2;
                    if(arr[i] == 0) break;
                }
                if(arr[i] == 0 && arr[i+1] == 0){
                    ans = -1;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
