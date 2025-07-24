package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BSequenceGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int b[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i =0;i < n;i++){
                b[i] = Integer.parseInt(st.nextToken());
            }

            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);
            for(int i =1;i < n;i++){
                if(b[i-1] <= b[i]){
                    a.add(b[i]);
                }
                else{
                    a.add(b[i]);
                    a.add(b[i]);
                }
            }

            System.out.println(a.size());

            for(int x : a){
                System.out.print(x + " ");
            }
        }
    }
}
