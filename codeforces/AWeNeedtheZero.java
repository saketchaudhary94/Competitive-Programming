package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AWeNeedtheZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int xor = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                xor ^= Integer.parseInt(st.nextToken());
            }

            if(n%2 == 0){
                if(xor == 0){
                    System.out.println(3);
                }
                else{
                    System.out.println(-1);
                }
                continue;
            }
            else{
                System.out.println(xor);
                continue;
            }
        }
    }
}
