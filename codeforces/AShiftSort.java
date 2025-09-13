package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AShiftSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int cntZero = 0;

            for(int i =0;i < n;i++){
                if(s.charAt(i) == '0') cntZero++;
            }

            int cntOnes = 0;
            for(int i =0;i < cntZero;i++){
                if(s.charAt(i) == '1'){
                    cntOnes++;
                }
            }

            System.out.println(cntOnes);
        }
    }
}
