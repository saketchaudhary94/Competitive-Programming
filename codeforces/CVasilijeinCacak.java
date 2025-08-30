package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CVasilijeinCacak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long minSum = k*(k+1) /2;
            long maxSum = n*(n+1)/2 - (n-k)*(n-k+1)/2;

            if(minSum <= x && x <= maxSum) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
