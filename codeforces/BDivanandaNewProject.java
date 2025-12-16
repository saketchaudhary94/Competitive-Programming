package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BDivanandaNewProject {

    static class Pair{
        int visit;
        int idx;

        public Pair(int visit , int idx){
            this.visit = visit;
            this.idx = idx;
        }
    }
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
            
            ArrayList<Pair> sortedVisit = new ArrayList<>();
            for(int i =0;i < n;i++){
                sortedVisit.add(new Pair(a[i] , i));
            }

            Collections.sort(sortedVisit, (x, y) -> Integer.compare(y.visit, x.visit));
            int ans[] = new int[n+1];
            ans[0] = 0;

            long minutes = 0;
            int coordinate= 1;
            for(int i =0;i < n;i++){
                ans[sortedVisit.get(i).idx + 1] = coordinate;
                minutes += 2L * Math.abs(coordinate) * sortedVisit.get(i).visit;

                if(coordinate < 0){
                    coordinate = Math.abs(coordinate) + 1;
                }
                else{
                    coordinate = -coordinate;
                }
            }

            System.out.println(minutes);
            for(int el : ans){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
