package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AOneandTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            int twoCnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] == 2) twoCnt++;
            }

            if(twoCnt == 0){
                System.out.println(1);
                continue;
            }
            else if(twoCnt %2 != 0){
                System.out.println(-1);
                continue;
            }
            else{
                int newCnt = twoCnt/2;
                int k =0;
                int i =0;
                while(newCnt != 0){
                    k++;
                    if(arr[i] == 2){
                        newCnt--;
                    }
                    i++;
                }
                System.out.println(k);
            }
        }
    }
}
