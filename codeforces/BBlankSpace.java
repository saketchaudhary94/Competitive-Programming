package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BBlankSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());

            int maxSpace = 0;
            int space = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int el = Integer.parseInt(st.nextToken());
                if(el == 0){
                    space++;
                    maxSpace = Math.max(maxSpace , space);
                }
                else{
                    space = 0;
                }
            }
            System.out.println(maxSpace);
        }
    }
}