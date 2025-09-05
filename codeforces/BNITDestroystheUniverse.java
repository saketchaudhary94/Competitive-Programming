package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BNITDestroystheUniverse {
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

            int cntZero = 0;
            for(int el : arr){
                if(el == 0) cntZero++;
            }

            if(cntZero == n){
                System.out.println(0);
                continue;
            }

            int left = 0;
            int right = n-1;
            
            while(arr[left] == 0) left++;
            while(arr[right] == 0) right--;

            boolean foundZero = false;
            for(int i = left;i <= right;i++){
                if(arr[i] == 0) foundZero = true;
            }

            if(foundZero) System.out.println(2);
            else System.out.println(1);
        }
    }
}
