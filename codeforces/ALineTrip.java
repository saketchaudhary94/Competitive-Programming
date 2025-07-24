package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ALineTrip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            ArrayList<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            list.add(0);

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int a = Integer.parseInt(st.nextToken());
                list.add(a);
            }
            list.add(x);
            n = list.size();

            int max = Integer.MIN_VALUE;
            for(int i =1;i < n;i++){
                if(i == n-1){
                    max = Math.max(max , 2*(list.get(i) - list.get(i-1)));
                }
                else{
                    max = Math.max(max , list.get(i) - list.get(i-1));
                }
            }
            System.out.println(max);
        }
    }
}
