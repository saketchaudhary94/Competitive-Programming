package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BSumofMedians {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int len = n*k;
            int arr[] = new int[len];
            
            st = new StringTokenizer(br.readLine());
            for(int i =0;i < len;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            long sum = 0;
            long ptr = n*k;
            while(k-- > 0){
                ptr -= (n / 2 +1);
                sum += arr[(int)ptr];
            }

            System.out.println(sum);
        }
    }
}
