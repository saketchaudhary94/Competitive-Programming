package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AAllLengthsSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxIdx = -1;
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] == n) maxIdx = i;
            }

            boolean check = false;
            for(int i =0;i < maxIdx-1;i++){
                if(arr[i] > arr[i+1]){
                    check = true;
                    break;
                }
            }

            if(check == false){
                for(int i = maxIdx;i < n-1;i++){
                    if(arr[i] < arr[i+1]){
                        check = true;
                        break;
                    }
                }
            }

            if(check) System.out.println("no");
            else System.out.println("yes");

        }
    }
}
