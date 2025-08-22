package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AServalandMochasArray {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }
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
            for(int i =0;i < n;i++){
                for(int j =i+1;j<n;j++){
                    if(gcd(arr[i] , arr[j]) <= 2){
                        flag = true;
                        break;
                    }
                }
            }

            if(flag){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
