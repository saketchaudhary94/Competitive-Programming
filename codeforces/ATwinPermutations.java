
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ATwinPermutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int el = Integer.parseInt(st.nextToken());
                arr[i] = n - el +1;
            }

            for(int el : arr){
                System.out.print(el+" ");
            }
        }
    }
}
