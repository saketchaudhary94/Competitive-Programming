package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BValeriiAgainstEveryone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i < n;i++){
                int x = Integer.parseInt(st.nextToken());
                set.add(x);
            }

            if(set.size() == n){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
