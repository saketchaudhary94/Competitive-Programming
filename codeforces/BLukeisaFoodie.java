package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BLukeisaFoodie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int arr[] = new int[n];
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long range[][] = new long[n][2];
            for(int i =0;i < n;i++){
                range[i][0] = (long)arr[i] - x;
                range[i][1] = (long)arr[i] + x;
            }

            long l = range[0][0];
            long r = range[0][1];
            int ans = 0;
            for(int i =1;i < n;i++){
                l = Math.max(l , range[i][0]);
                r = Math.min(r , range[i][1]);

                if(l > r){
                    ans++;
                    l = range[i][0];
                    r = range[i][1];
                }
            }

            System.out.println(ans);
        }
    }
}
