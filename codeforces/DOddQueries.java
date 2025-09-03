package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DOddQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int arr[] = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                if(i == 0){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                else{
                    arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
                }
            }

            while(q-- > 0){
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                int sum =0;
                sum = (arr[n-1] - (arr[r-1] - (l > 1 ? arr[l-2] : 0))) + (r - l +1)*k;

                if(sum %2 == 0) System.out.println("No");
                else System.out.println("Yes");
            }
        }
    }
}
