package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DDistinctSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            HashSet<Character> set = new HashSet<>();
            int prefix[] = new int[n];
            int suffix[] = new int[n];

            set.add(s.charAt(0));
            prefix[0] = 1;
            for(int i=1;i < n;i++){
                set.add(s.charAt(i));
                prefix[i] = set.size();
            }

            set.clear();
            set.add(s.charAt(n-1));
            suffix[n-1] = 1;
            for(int i = n-2;i >=0 ;i--){
                set.add(s.charAt(i));
                suffix[i] = set.size();
            }

            long maxVal = 0;
            for(int i=0;i < n-1;i++){
                maxVal = Math.max(maxVal , (long)prefix[i] + suffix[i+1]);
            }

            System.out.println(maxVal);
        }
    }
}
