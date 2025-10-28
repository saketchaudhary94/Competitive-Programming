package CP.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BYourName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t1 = st.nextToken();
            int arr[] = new int[26];
            
            for(char ch : s.toCharArray()){
                arr[ch - 'a']++;
            }
            
            for(char ch : t1.toCharArray()){
                arr[ch - 'a']--;
            }

            boolean flag = false;
            for(int el : arr){
                if(el != 0){
                    flag = true;
                    break;
                }
            }

            if(flag) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
