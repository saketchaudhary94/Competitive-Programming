package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AThreeIndices {
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

            boolean flag = false;
            for(int i =1;i < n-1;i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.println("YES");
                    System.out.println(i+" "+(i+1)+" "+(i+2));
                    flag = true;
                    break;
                }
            }
           if(!flag)  System.out.println("NO");
        }
    }
}
