package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BArrayCloningTechnique {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            }
            int currFreq = 0;
            for(int key : map.keySet()){
                currFreq = Math.max(currFreq , map.get(key));
            }

            int op = 0;
            while(currFreq < n){
                op++;
                if(currFreq *2 <= n){
                    op += currFreq;
                    currFreq *= 2;
                }
                else{
                    op += (n - currFreq);
                    currFreq = n;
                }
            }
            System.out.println(op);
        }
    }
}
