package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CIsamatdin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            boolean odd = false , even = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] % 2 == 0) even = true;
                else odd = true;
            }

            if(odd && even){
                Arrays.sort(arr);
            }

            for(int el : arr){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
