
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class AHelmets {

    public static class Pair{
        int first;
        int second;

        public Pair(int first , int second){
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
            int p = Integer.parseInt(st.nextToken());
            int a[] = new int[n];
            int b[] = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                b[i] = Integer.parseInt(st.nextToken());
            }

            ArrayList<Pair> list = new ArrayList<>();
            for(int i =0;i < n;i++){
                list.add(new Pair(a[i] , b[i]));
            }

            Collections.sort(list , (x , y)-> Integer.compare(x.second, y.second));

            long mini = p;
            long shared = 1;

            for(Pair pair : list){
                long canShared = pair.first;
                long cost = pair.second;

                if(cost >= p){
                    break;
                }

                if(shared + canShared > n){
                    mini += (long)(n - shared)* cost;
                    shared = n;
                    break; 
                }
                else{
                    mini += (long)canShared * cost;
                    shared += (long)canShared;
                }
            }

            mini += (long)(n - shared) * p;
            System.out.println(mini);
        }
    }
}
