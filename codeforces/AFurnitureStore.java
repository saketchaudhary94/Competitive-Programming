package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AFurnitureStore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0;i < n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int mini = arr[0];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =1;i < n;i++){
                if(arr[i] > mini){
                    list.add(i+1);
                }
                else{
                    mini = arr[i];
                }
            }
            System.out.println(list.size());

            for(int el : list){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
