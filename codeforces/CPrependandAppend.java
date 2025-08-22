package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPrependandAppend {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int l = 0;
            int r = n-1;
            int res = n;

            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    res -= 2;
                    l++;
                    r--;
                }
                else{
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
