package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AHomework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();
            int m = Integer.parseInt(br.readLine());
            String b = br.readLine();
            String c = br.readLine();

            StringBuilder sb = new StringBuilder(a);
            for(int i =0;i < m;i++){
                if(c.charAt(i) == 'D'){
                    sb.append(b.charAt(i));
                }
                else{
                    sb.insert(0 , b.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
