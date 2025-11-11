package CP.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CTrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine();
            s += s;

            int minAmount = Integer.MIN_VALUE;
            int lastG = -1;
            
            for(int i = 2*n -1;i >=0;i--){
                if(s.charAt(i) == 'g'){
                    lastG = i;
                }

                if(s.charAt(i) == c){
                    int diff = lastG - i;
                    minAmount = Math.max(minAmount , diff);
                }
            }

            System.out.println(minAmount);
        }
    }
}
