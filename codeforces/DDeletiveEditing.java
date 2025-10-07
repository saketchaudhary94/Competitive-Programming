package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DDeletiveEditing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n--  > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            int l = 0;
            int r = 0;
            
            while(l < s.length() && r < t.length()){
                if(s.charAt(l) == t.charAt(r)){
                    r++;
                }
                l++;
            }

            if(r == t.length()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
