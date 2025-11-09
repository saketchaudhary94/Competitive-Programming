package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BMonsters {

    public static  class pair{
        int first;
        int second;

        public pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            ArrayList<pair> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                int first = Integer.parseInt(st.nextToken());
                first %= k;
                first = first == 0 ? k : first;
                list.add(new pair(first , i+1));
            }

            Collections.sort(list , (a , b)->{
                if(a.first != b.first) return b.first - a.first;
                else return a.second - b.second;
            });

            for(pair curr : list){
                System.out.print(curr.second+" ");
            }
            System.out.println();
        }
    }
}
