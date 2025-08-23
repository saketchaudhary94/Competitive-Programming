package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AMakeitBeautiful {
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
            Arrays.sort(arr);
        
            if(arr[0] == arr[n-1]){
                System.out.println("no");
                continue;
            }
            else{
                System.out.println("yes");
                System.out.print(arr[n-1]+" ");
                for(int i =0;i < n-1;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
