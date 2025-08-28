package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BChemistry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();
            int arr[] = new int[26];

            for(int i =0;i < n;i++){
                arr[s.charAt(i) - 'a']++;
            }

            int oddCnt = 0;
            for(int el : arr){
                if(el % 2 != 0) oddCnt++;
            }

            if(oddCnt > k+1) System.out.println("no");
            else System.out.println("yes");
        }
    }
}
