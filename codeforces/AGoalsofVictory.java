package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AGoalsofVictory {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n-1;i++){
                sum += Integer.parseInt(st.nextToken());
            } 

            System.out.println(-sum);
        }
    }
}
