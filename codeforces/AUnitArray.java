
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AUnitArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int neg = 0;
            int pos = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int el = Integer.parseInt(st.nextToken());
                if(el == 1){
                    pos++;
                }
                else{
                    neg++;
                }
            }

            int op = 0;
            while(pos < neg || neg %2 != 0){
                neg--;
                pos++;
                op++;
            }

            System.out.println(op);
        }
    }
}
