package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CDoubleendedStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String A = br.readLine();
            String B = br.readLine();
            int n =A.length();
            int m = B.length();

            int lcs = 0;
            for(int len = 1;len <= Math.min(n,m);len++){
                for(int i =0;i + len <= n;i++){
                    for(int j = 0;j+len <= m;j++){
                        String subA = A.substring(i ,i+ len);
                        String subB = B.substring(j ,j+ len);

                        if(subA.equals(subB)){
                            lcs = Math.max(lcs , len);
                        }
                    }
                }
            }

            int minOp = n + m - 2*lcs;
            System.out.println(minOp);
        }
    }
}
