package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AUnitedWeStand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            int mx = Arrays.stream(a).max().getAsInt();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for(int el : a){
                if(el == mx){
                    c.add(el);
                }
                else{
                    b.add(el);
                }
            }
            
            if(b.size() == 0){
                System.out.println(-1);
            }
            else{
                System.out.println(b.size()+" "+c.size());
                for(int el : b){
                    System.out.print(el+" ");
                }
                System.out.println();
                for(int el : c){
                    System.out.print(el+" ");
                }
            }
        }
    }
}
