package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BBasketballTogether {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i =0;i < n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int cnt = 0;
        int x = n;
        for(int i = n-1;i >= 0;i--){
            int need = 0;
            if(D % arr[i] == 0){
                need =  (D / arr[i]) + 1;
            }
            else{
                need = (int) Math.ceil((double)D / arr[i]);
            }
            if(need <= x){
                cnt++;
                x -=  need;
            }
            else{
                break;
            }
        }
        System.out.println(cnt);
    }
}
