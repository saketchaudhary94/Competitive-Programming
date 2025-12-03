package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BShoeShuffling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            HashMap<Integer , Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            }

            boolean check = false;
            for(int val : map.values()){
                if(val == 1){
                    check = true;
                    break;
                }
            }

            if(check){
                System.out.println(-1);
                continue;
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i <=n;i++){
                list.add(i);
            }

            int l = 0 , r = 0;
            while(r < n){
                if(arr[l] == arr[r]){
                    r++;
                }
                else{
                    Collections.rotate(list.subList(l, r), 1);
                    l = r;
                }
            }
            Collections.rotate(list.subList(l, r), 1);

            for(int i =0;i < list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
