package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADesorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int minOp = Integer.MAX_VALUE;
            for(int i =1;i < n;i++){
                if(arr[i] >= arr[i-1]){
                    minOp = Math.min(minOp , (arr[i] - arr[i-1])/2 + 1);
                }
                else{
                    minOp = 0;
                }
            }
            System.out.println(minOp);
        }
    }
}
