package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOlya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int secondMini[] = new int[n];
            int miniFirst = Integer.MAX_VALUE;
            int idx = 0;

            while(n-- > 0){
                int m = Integer.parseInt(br.readLine());
                int arr[] = new int[m];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int i =0;i < m;i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(arr);
                miniFirst = Math.min(miniFirst , arr[0]);
                secondMini[idx++] = arr[1];
            }

            Arrays.sort(secondMini);
            int miniSecond = secondMini[0];
            long sum =  Arrays.stream(secondMini).mapToLong(x -> x).sum();
            sum = sum + miniFirst - miniSecond;
            System.out.println(sum);
        }
    }
}
